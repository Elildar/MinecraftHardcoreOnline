package mho.block.deco;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSecretDoor extends BlockDoor {

	public BlockSecretDoor(int id, Material material, String name) {
		super(id, material);
        disableStats();
        this.setUnlocalizedName("MHO" + name);
		this.setTextureName(name);
	}

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
    	this.blockIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
	
    @Override
    public Icon getBlockTexture(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        int blockBelow = iblockaccess.getBlockId(i, j - 1, k);
        
        if (blockBelow == blockID)
        {
            blockBelow = iblockaccess.getBlockId(i, j - 2, k);
            if (blockBelow == Block.grass.blockID || blockBelow == Block.mycelium.blockID)
            {
                return Block.dirt.getBlockTexture(iblockaccess, i, j - 2, k, l);
            }
            if (iblockaccess.getBlockId(i, j - 2, k) > 0)
            {
                return Block.blocksList[iblockaccess.getBlockId(i, j - 2, k)].getIcon(6, iblockaccess.getBlockMetadata(i, j - 2, k));
            }
        }
        
        if (blockBelow == Block.grass.blockID || blockBelow == Block.mycelium.blockID)
        {
            return Block.dirt.getBlockTexture(iblockaccess, i, j - 1, k, l);
        }
        if (iblockaccess.getBlockId(i, j - 1, k) > 0)
        {
            return Block.blocksList[iblockaccess.getBlockId(i, j - 1, k)].getIcon(6, iblockaccess.getBlockMetadata(i, j - 1, k));
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public int idDropped(int i, Random random, int j)
    {
        return (i & 8) != 0 ? 0 : (blockMaterial == Material.iron
                ? Mho.itemBlockSecretDoorIron.itemID
                : Mho.itemBlockSecretDoorWood.itemID);
    }
}

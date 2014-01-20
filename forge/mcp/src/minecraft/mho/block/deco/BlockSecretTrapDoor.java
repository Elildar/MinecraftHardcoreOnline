package mho.block.deco;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSecretTrapDoor extends BlockTrapDoor {

	public BlockSecretTrapDoor(int id, Material material, String name) {
		super(id, material);
        disableStats();
        this.setHardness(1.2F);
        this.setStepSound(Block.soundWoodFootstep);
        this.setCreativeTab(Mho.tabMhoDecorations);
        this.setUnlocalizedName("MHO" + name);
		this.setTextureName(name);
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
        int meta = iblockaccess.getBlockMetadata(i, j, k);
        int i1 = i;
        int k1 = k;

        if ((meta & 3) == 0)
        {
            k1 = k + 1;
        }

        if ((meta & 3) == 1)
        {
            --k1;
        }

        if ((meta & 3) == 2)
        {
            i1 = i + 1;
        }

        if ((meta & 3) == 3)
        {
            --i1;
        }

        int blockBelow = iblockaccess.getBlockId(i1, j, k1);
        
        if (blockBelow == Block.grass.blockID || blockBelow == Block.mycelium.blockID)
        {
            return Block.dirt.getBlockTexture(iblockaccess, i, j - 1, k, l);
        }
        if (blockBelow > 0)
        {
            return Block.blocksList[blockBelow].getIcon(1, iblockaccess.getBlockMetadata(i1, j, k1));
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public int idDropped(int i, Random random, int j)
    {
        return Mho.blockSecretTrapDoor.blockID;
    }
}

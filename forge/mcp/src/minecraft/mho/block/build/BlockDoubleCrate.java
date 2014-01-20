package mho.block.build;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDoubleCrate extends Block {

	protected Icon upperFaceIcon;
	protected Icon lowerFaceIcon;
	protected Icon topIcon;
	
	public BlockDoubleCrate(int par1, String name) {
		super(par1, Material.wood);
		this.setHardness(1.0F); //How hard the block is to break
		this.setResistance(1.0F); //How well the block resists explosions
		this.setStepSound(super.soundWoodFootstep); //The sound the block makes when you walk on it as well as place or break it
		this.setUnlocalizedName("MHO"+name+"Block");
		this.setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.upperFaceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Upper");
             this.lowerFaceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Lower");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1 || side == 0) {
    		return topIcon;
    	}
    	else if (meta == 0) {
    		return lowerFaceIcon;
    	}
    	else
    		return upperFaceIcon;
    }
	
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return par3 >= 255 ? false : par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && super.canPlaceBlockAt(par1World, par2, par3, par4) && super.canPlaceBlockAt(par1World, par2, par3 + 1, par4);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int x, int y, int z, int neighbor)
    {
        int meta = par1World.getBlockMetadata(x, y, z);

        if (meta == 0)
        {
            if (par1World.getBlockId(x, y + 1, z) != this.blockID)
            {
                par1World.setBlockToAir(x, y, z);
            }

            if (!par1World.doesBlockHaveSolidTopSurface(x, y - 1, z))
            {
                par1World.setBlockToAir(x, y, z);
                if (!par1World.isRemote)
                {
                    this.dropBlockAsItem(par1World, x, y, z, meta, 0);
                }

                if (par1World.getBlockId(x, y + 1, z) == this.blockID)
                {
                    par1World.setBlockToAir(x, y + 1, z);
                }
            }
        }
        else
        {
            if (par1World.getBlockId(x, y - 1, z) != this.blockID)
            {
                par1World.setBlockToAir(x, y, z);
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Mho.doubleCrateItemBlock.itemID;
    }

    @SideOnly(Side.CLIENT)
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Mho.doubleCrateItemBlock.itemID;
    }

}

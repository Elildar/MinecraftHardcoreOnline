package mho.block.deco;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDoubleBrightLower extends Block {
	public BlockDoubleBrightLower(int ID, Material par2Material, String name) {
		super(ID, par2Material);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightOpacity(0);
		this.setBlockBounds(0.425F, 0.0F, 0.425F, 0.575F, 1.0F, 0.575F);
		this.setUnlocalizedName("MHO"+name+"Lower");
		this.setTextureName(name);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + 0.375F), (double)par3, (double)((float)par4 + 0.375F), (double)((float)par2 + 0.625F), (double)((float)par3 + 1.0F), (double)((float)par4 + 0.625F));
    }
	
	public int getRenderType()
    {
        return 2;
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }
	
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
        if (par1World.getBlockId(x, y + 1, z) != this.blockID + 1)
        {
            par1World.setBlockToAir(x, y, z);
        }

        if (!par1World.doesBlockHaveSolidTopSurface(x, y - 1, z))
        {
            par1World.setBlockToAir(x, y, z);
            if (!par1World.isRemote)
            {
                this.dropBlockAsItem(par1World, x, y, z, 0, 0);
            }

            if (par1World.getBlockId(x, y + 1, z) == this.blockID + 1)
            {
                par1World.setBlockToAir(x, y + 1, z);
            }
        }
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName() + "Lower");
    }
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID+1;
    }

    @SideOnly(Side.CLIENT)
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID+1;
    }

}

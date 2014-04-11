package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockChain extends BlockLadder {

	public BlockChain(int par1, String name) {
		super(par1);
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + 0.375F), (double)par3, (double)((float)par4 + 0.375F), (double)((float)par2 + 0.625F), (double)((float)par3 + 1.0F), (double)((float)par4 + 0.625F));
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {}

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		return true;
    }

    /**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        return par9;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {}

    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}

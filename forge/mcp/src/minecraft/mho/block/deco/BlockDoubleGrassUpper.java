package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDoubleGrassUpper extends Block {
	public BlockDoubleGrassUpper(int par1, String name) {
		super(par1, Material.grass);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
        this.setStepSound(Block.soundGrassFootstep);
        this.setCreativeTab(Mho.tabMhoDecorations);
        this.setLightOpacity(0);
		this.setUnlocalizedName("MHO"+name+"Upper");
		this.setTextureName(name);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
	
	public int getRenderType()
    {
        return 1;
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

	public int onBlockPlaced(World par1World, int x, int y, int z, int par5, float par6, float par7, float par8, int par9)
    {
		return par9;
    }

    /**
     * Called after a block is placed
     */
    public void onPostBlockPlaced(World par1World, int x, int y, int z, int par5)
    {
        if (par1World.getBlockId(x, y - 1, z) != this.blockID - 1)
        {
        	par1World.setBlock(x, y, z, this.blockID - 1);
    		par1World.setBlock(x, y + 1, z, this.blockID);
        }
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
        if (par1World.getBlockId(x, y - 1, z) != this.blockID - 1)
        {
            par1World.setBlockToAir(x, y, z);
        }
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName() + "Upper");
    }
	
}

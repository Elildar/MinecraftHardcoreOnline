package mho.block.generic;

import mho.Mho;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTransparent extends BlockGlass {

	private boolean localFlag = false;
	
	public BlockTransparent(int ID, Material par2Material, String name) {
		super(ID, par2Material, true);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(super.soundStoneFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setLightOpacity(100);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() //Put 0 for fully transparent or opaque blocks, and 1 for semi-transparent
	{
        return 1;
	}

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.localFlag && var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}

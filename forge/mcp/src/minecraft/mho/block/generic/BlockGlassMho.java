package mho.block.generic;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlassMho extends BlockGlass {

	private boolean localFlag = false;
	
	public BlockGlassMho(int ID, Material par2Material, String name) {
		super(ID, par2Material, true);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(Block.soundGlassFootstep); 
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setLightOpacity(0);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

    public int quantityDropped(Random par1Random)
    {
        return this.blockMaterial == Material.iron ? 1 : 0;
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }

    @Override
	public boolean isOpaqueCube()
    {
        return false;
    }

	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.localFlag && var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}

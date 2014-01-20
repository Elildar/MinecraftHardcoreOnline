package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFlowerMho extends BlockFlower {

	public BlockFlowerMho(int par1, String name) {
		super(par1, Material.grass);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
		setStepSound(Block.soundGrassFootstep);
		setCreativeTab(Mho.tabMhoDecorations);
		setUnlocalizedName("MHO"+name);
		setTextureName(name);
	}
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		if (below != null) {
			return true;
		}
		else {
			return false;
		}
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		if (below != null) {
			return true;
		}
		else {
			return false;
		}
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}

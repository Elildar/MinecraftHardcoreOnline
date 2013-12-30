package mho.block.nature;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class MhoFlower extends BlockFlower {

	public MhoFlower(int par1, String Name) {
		super(par1, Material.grass);
		setStepSound(Block.soundGrassFootstep);
		setCreativeTab(Mho.tabMhoNature);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
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

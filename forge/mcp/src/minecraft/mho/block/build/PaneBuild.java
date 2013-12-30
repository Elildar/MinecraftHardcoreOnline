package mho.block.build;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class PaneBuild extends BlockPane {

	public PaneBuild(int par1, String texture, String Name) {
		super(par1, Mho.modid + ":" + texture, Mho.modid + ":paneSide", Material.glass, false);
		setCreativeTab(Mho.tabMhoBlocks);
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
	    }
	*/
}

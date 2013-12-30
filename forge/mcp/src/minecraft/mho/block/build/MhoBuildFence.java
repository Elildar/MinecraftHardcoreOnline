package mho.block.build;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class MhoBuildFence extends BlockFence {

	private Block modelBlock;
	
	public MhoBuildFence(int par1, Block origin, String Name) {
		super(par1, "toto", origin.blockMaterial);
		this.modelBlock = origin;
		this.setCreativeTab(Mho.tabMhoFence);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + modelBlock.getTextureName());
	    }
	*/
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
    	return this.modelBlock.getBlockTextureFromSide(par1);
    }

}

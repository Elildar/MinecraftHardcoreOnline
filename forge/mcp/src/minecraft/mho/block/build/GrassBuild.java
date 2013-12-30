package mho.block.build;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class GrassBuild extends Block {
	
	private Icon topIcon;
	private Icon botIcon;
	private Icon faceIcon;
	
	public GrassBuild(int par1, String Name) {
		super(par1, Material.grass);
		setStepSound(super.soundGrassFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoNature); //The tab it appears in
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassTop");
             this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Dirt");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassFace");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1) {
    		return topIcon;
    	}
    	else if (side == 0) {
    		return botIcon;
    	}
    	else {
    		return faceIcon;
    	}
    }
}

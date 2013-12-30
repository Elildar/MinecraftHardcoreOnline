package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class Lampion extends BlockDirectional {
	
	private Icon topIcon;
	private Icon botIcon;
	private Icon faceIcon;
	
	public Lampion(int par1, String Name) {
		super(par1, Material.cloth);
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundClothFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setLightValue(1.0F);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Bot");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Face");
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

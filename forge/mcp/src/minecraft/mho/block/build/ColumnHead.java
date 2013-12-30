package mho.block.build;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ColumnHead extends BlockDirectional {
	
	private Icon faceIcon;
	private Icon botIcon;
	private Icon topIcon;
	
	public ColumnHead(int ID, String Name) {
		super(ID, Material.rock); //The ID and material (The material defines what tools are better on it)
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"SlabTop");
             this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"ColumnTop");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"ColumnHeadFace");
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

package mho.block.build;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.Block;
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


public class Column extends BlockDirectional {
	
	private Icon topIcon;
	private Icon faceIcon;
	
	public Column(int ID, String Name) {
		super(ID, Material.rock); //The ID and material (The material defines what tools are better on it)
		 //The incode name of the block
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
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"ColumnTop");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"ColumnFace");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1 || side == 0) {
    		return topIcon;
    	}
    	else {
    		return faceIcon;
    	}
    }
} 
package mho.block.build;

import mho.Mho;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColumnHead extends BlockDirectional {
	
	private Icon faceIcon;
	private Icon botIcon;
	private Icon topIcon;
	
	public BlockColumnHead(int ID, Material par2Material, String name) {
		super(ID, par2Material); //The ID and material (The material defines what tools are better on it)
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setUnlocalizedName("MHO"+name+"ColumnHead");
		setTextureName(name);
	}

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"DoubleSlabTop");
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

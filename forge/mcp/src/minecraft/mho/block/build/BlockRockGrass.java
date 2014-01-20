package mho.block.build;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRockGrass extends Block {
	
	private Icon topIcon;
	private Icon botIcon;
	private Icon faceIcon;
	
	public BlockRockGrass(int par1, String name) {
		super(par1, Material.rock);
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setUnlocalizedName("MHO"+name+"Grass");
		setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
         this.topIcon = iconRegister.registerIcon(Mho.modid + ":rockGrassTop");
         this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Bot");
         this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassFace");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1) {
    		return topIcon;
    	}
    	if (side == 0) {
    		return botIcon;
    	}	
    	else {
    		return faceIcon;
    	}
    }
}

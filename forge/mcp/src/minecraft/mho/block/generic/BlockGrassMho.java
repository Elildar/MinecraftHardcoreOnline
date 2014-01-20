package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrassMho extends Block {

	private Icon topIcon;
	private Icon botIcon;
	private Icon faceIcon;
	
	public BlockGrassMho(int par1, String name) {
		super(par1, Material.grass);
		this.setHardness(1.0F); //How hard the block is to break
		this.setResistance(1.0F); //How well the block resists explosions
		this.setStepSound(super.soundGrassFootstep); //The sound the block makes when you walk on it as well as place or break it
		this.setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		this.setUnlocalizedName("MHO"+name+"GrassBlock");
		this.setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
	public void registerIcons(IconRegister iconRegister)
	{
         this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassBlockTop");
         this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Dirt");
         this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassBlockFace");
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

package mho.block.generic;

import mho.Mho;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDirectionalSimple extends BlockDirectional {

	private Icon faceIcon;
	private Icon topIcon;
	
	public BlockDirectionalSimple(int ID, Material par2Material, String name) {
		super(ID, par2Material);
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setUnlocalizedName("MHO"+name);
		setTextureName(name);
	}

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
	    this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
	    this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Face");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 0 || side == 1) {
    		return topIcon;
    	}
    	else {
    		return faceIcon;
    	}
    }
}

package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class InvisibleBlock extends Block {

	public InvisibleBlock(int ID, String Name) {
		super(ID, Material.rock); //The ID and material (The material defines what tools are better on it)
		setHardness(300000.0F); //How hard the block is to break
		setResistance(300000.0F); //How well the block resists explosions
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	public boolean isOpaqueCube()
    {
        return false;
    }
}

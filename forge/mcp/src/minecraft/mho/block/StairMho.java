package mho.block;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StairMho extends BlockStairs {
	public StairMho(int par1, Block par2Block, int par3, String Name) {
		super(par1, par2Block, par3);
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoStairs); //The tab it appears in
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }*/
}

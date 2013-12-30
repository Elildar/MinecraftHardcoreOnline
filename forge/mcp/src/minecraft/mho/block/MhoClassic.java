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
import net.minecraft.creativetab.CreativeTabs;

public class MhoClassic extends Block {
	boolean opaque;
	public MhoClassic(int ID, String Name, Boolean opacity) {
		super(ID, Material.cloth);
		setHardness(1.0F);
		setResistance(1.0F);
		opaque = opacity;
		setStepSound(super.soundGrassFootstep);
		setCreativeTab(Mho.tabMhoBlocks);
		GameRegistry.registerBlock(this, Name);
	}
	
	public boolean isOpaqueCube()
    {
        return opaque;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}

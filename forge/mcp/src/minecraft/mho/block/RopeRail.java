package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IconRegister;

public class RopeRail extends BlockRail{

	public RopeRail(int par1, int par2, String Name) {
		super(par1);
		setCreativeTab(Mho.tabMhoBlocks);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
	    }
}

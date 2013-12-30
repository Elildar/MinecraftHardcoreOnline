package mho.block.nature;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;

public class LiquidStill extends BlockStationary {
	
	String texture;

	public LiquidStill(int par1, String Name, String Texture) 
	{
		super(par1, Material.water);
    	this.blockHardness = 100.0F;
        this.setLightOpacity(3);
        this.disableStats();
		setCreativeTab(Mho.tabMhoNature);
		GameRegistry.registerBlock(this, Name);
		texture = Texture;
	}
	
	@SideOnly(Side.CLIENT)
    public String getTextureFile()
    {
		return texture;
    }
}
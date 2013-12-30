package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;

public class TabMhoGrey extends CreativeTabs {

	public TabMhoGrey(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.ghastTentacle.itemID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Items Gris"; //The name of the tab ingame
	}
}

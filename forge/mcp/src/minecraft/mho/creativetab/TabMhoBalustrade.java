package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;

public class TabMhoBalustrade extends CreativeTabs  {
	public TabMhoBalustrade(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.whiteStonebrickAnvil.blockID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Balustrades"; //The name of the tab ingame
	}
}

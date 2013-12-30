package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;

public class TabMhoFence extends CreativeTabs  {
	public TabMhoFence(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.fenceWhiteStonebrick.blockID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : barrieres"; //The name of the tab ingame
	}
}

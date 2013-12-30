package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;

public class TabMhoWalls extends CreativeTabs  {
	public TabMhoWalls(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.wallWhiteStonebrick.blockID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : murets"; //The name of the tab ingame
	}
}

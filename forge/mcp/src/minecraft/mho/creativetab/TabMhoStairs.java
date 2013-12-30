package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;

public class TabMhoStairs extends CreativeTabs  {
	public TabMhoStairs(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.stairWhiteStonebrick.blockID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "MHO : Escaliers"; //The name of the tab ingame
	}
}

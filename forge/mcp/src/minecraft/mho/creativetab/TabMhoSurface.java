package mho.creativetab;

import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMhoSurface extends CreativeTabs {
	public TabMhoSurface(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.surfacePlankOak.blockID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Surfaces"; //The name of the tab ingame
	}
}

package mho.creativetab;

import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMhoNature extends CreativeTabs {
	public TabMhoNature(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.redGrass.blockID;
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Nature"; //The name of the tab ingame
	}
}

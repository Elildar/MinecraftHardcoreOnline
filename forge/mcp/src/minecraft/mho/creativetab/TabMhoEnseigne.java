package mho.creativetab;

import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMhoEnseigne extends CreativeTabs {
	public TabMhoEnseigne(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.enseigneAlchimie.blockID; //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Enseigne"; //The name of the tab ingame
	}
}

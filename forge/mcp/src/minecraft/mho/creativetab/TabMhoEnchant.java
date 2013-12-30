package mho.creativetab;

import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMhoEnchant extends CreativeTabs 
{
	public TabMhoEnchant(int position, String tabID) 
	{
		super(position, tabID); //The constructor for your tab
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() //The item it displays for your tab
	{
		return Mho.enchantFlameT1Big.itemID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "MHO : Enchantement"; //The name of the tab ingame
	}
}

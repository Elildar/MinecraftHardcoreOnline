package mho.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMhoInsignes extends CreativeTabs  {
	public TabMhoInsignes(int position, String tabID) {
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() 
	{
        return new ItemStack(Mho.valysInsignes); //For this we'll use the ruby
	}
	public String getTranslatedTabLabel()
	{
		return "MHO : Insignes"; //The name of the tab ingame
	}
}

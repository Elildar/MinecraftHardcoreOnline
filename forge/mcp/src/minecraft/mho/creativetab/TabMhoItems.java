package mho.creativetab;

import mho.common.Mho;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMhoItems extends CreativeTabs 
{
	public TabMhoItems(int position, String tabID) 
	{
		super(position, tabID); //The constructor for your tab
	}
	@SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() 
	{
        return new ItemStack(Mho.beer);
    }
	public String getTranslatedTabLabel()
	{
		return "MHO : Items"; //The name of the tab ingame
	}
}

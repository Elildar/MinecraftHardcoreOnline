package mho.core;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMho extends CreativeTabs {

    int iconID = 1;
    
	public TabMho(String label) {
		super(label);
	}

	public TabMho(int position, String label) {
		super(position, label);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return iconID;
	}

    public void setIconItem(int id)
    {
        iconID = id;
    }

    @SideOnly(Side.CLIENT)
    @Override
    /**
     * Gets the translated Label.
     */
    public String getTranslatedTabLabel()
    {
        return this.getTabLabel();
    }

}

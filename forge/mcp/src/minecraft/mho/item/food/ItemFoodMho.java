package mho.item.food;

import java.util.List;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodMho extends ItemFood
{
	private String addInfo;
	
    public ItemFoodMho(int id, int heal, float saturation, boolean wolfFood, String name, String info)
    {
        super(id, heal, saturation, wolfFood);
        this.addInfo = info;
		this.setUnlocalizedName("MHOfood" + name);
		this.setTextureName(Mho.modid + ":food/" + name);
    }
    
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{ 
		if (addInfo == null) { return; }
		else l.add(addInfo);
	}
}
package mho.item.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemFoodRhum extends ItemFoodMho
{
	private String AddInfo;
	
    public ItemFoodRhum(int id, int heal, float saturation, boolean wolfFood, String name, String info)
    {
        super(id, heal, saturation, wolfFood, name, info);
        this.maxStackSize = 1;
        this.setPotionEffect(Potion.confusion.id, 20, 1, 5.0F);
    }
    
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
}
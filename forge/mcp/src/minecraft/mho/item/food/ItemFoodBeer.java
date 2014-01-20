package mho.item.food;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemFoodBeer extends ItemFoodMho
{
    public ItemFoodBeer(int id, int heal, float saturation, boolean wolfFood, String name, String info)
    {
        super(id, heal, saturation, wolfFood, name, info);
        this.maxStackSize = 1;
        this.setPotionEffect(Potion.confusion.id, 10, 1, 1.0F);
    }

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Mho.mug);
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
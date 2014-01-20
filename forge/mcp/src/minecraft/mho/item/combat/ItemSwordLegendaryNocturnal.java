package mho.item.combat;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSwordLegendaryNocturnal extends ItemSwordMho
{
	public ItemSwordLegendaryNocturnal(int id, EnumToolMaterial toolMaterial, String name, boolean effet) 
	{
		super(id, toolMaterial, name, null, 7, effet);
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		--par1ItemStack.stackSize;
		par3World.setWorldTime(14000);
		return true;
    }
}
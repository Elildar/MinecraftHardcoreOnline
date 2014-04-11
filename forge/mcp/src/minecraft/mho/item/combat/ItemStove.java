package mho.item.combat;

import mho.Mho;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemStove extends ItemSwordMho {

	boolean antiBug = true;
	
	public ItemStove(int id, EnumToolMaterial par2EnumToolMaterial, String name, String info, int rare, boolean effet) {
		super(id, par2EnumToolMaterial, name, info, rare, effet);
	}

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
	@Override
    public boolean hitEntity(ItemStack sword, EntityLivingBase target, EntityLivingBase player)
    {
		if (!antiBug && target.getEntityName().equals("Chicken"))
		{
			target.dropItem(Mho.foodEgg.itemID, 1);
			antiBug = true;
		}
		else
		{
			antiBug = false;
		}
        sword.damageItem(1, player);
        player.playSound(Mho.modid + ":item.bong", 1.0F, 0.8F);
        return true;
    }
}

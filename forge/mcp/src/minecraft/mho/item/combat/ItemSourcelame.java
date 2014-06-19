package mho.item.combat;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSourcelame extends ItemSwordMho {

	public ItemSourcelame(int id, EnumToolMaterial par2EnumToolMaterial, String name, String info, int rare, boolean effet) {
		super(id, par2EnumToolMaterial, name, info, rare, effet);
		this.setCreativeTab(null);
	}

    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if (par3Entity instanceof EntityPlayer)
    	{
    		((EntityPlayer) par3Entity).addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1, 4));
    	}
    	par3Entity.setFire(1);
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase target, EntityLivingBase player)
    {
    	target.removePotionEffect(Potion.fireResistance.id);
    	//target.clearActivePotions();
    	target.setFire(5);
        par1ItemStack.damageItem(1, player);
        return true;
    }

}

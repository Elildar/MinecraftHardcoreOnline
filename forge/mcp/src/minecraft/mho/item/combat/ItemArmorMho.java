package mho.item.combat;
 
import mho.Mho;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
 
public class ItemArmorMho extends ItemArmor
{
    public String textureName;

    public ItemArmorMho(int id, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String name)
    {
        super(id, par2EnumArmorMaterial, par3, par4);
		maxStackSize = 1;
		this.textureName = name;
		this.setCreativeTab(Mho.tabMhoCombat);
		this.setUnlocalizedName("MHO" + name);
		this.setTextureName(Mho.modid + ":combat/" + name);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        return Mho.modid + ":armor/" + textureName + ".png";
    }
}
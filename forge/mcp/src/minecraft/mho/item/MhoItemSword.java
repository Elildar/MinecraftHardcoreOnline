package mho.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class MhoItemSword extends ItemSword {

	public MhoItemSword(int par1, EnumToolMaterial par2EnumToolMaterial, String Name) {
		super(par1, par2EnumToolMaterial);
		maxStackSize = 1;
		this.setCreativeTab(Mho.tabMhoItems);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.itemIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
    }
}

package mho;

import static mho.core.common.CustomItemRarity.COLOR_EPIC;
import static mho.core.common.CustomItemRarity.COLOR_JUNK;
import static mho.core.common.CustomItemRarity.COLOR_LEGENDARY;
import static mho.core.common.CustomItemRarity.COLOR_MAGICAL;
import static mho.core.common.CustomItemRarity.COLOR_NORMAL;
import static mho.core.common.CustomItemRarity.COLOR_RARE;
import static mho.core.common.CustomItemRarity.COLOR_UNCOMMON;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_EPIC;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_JUNK;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_LEGENDARY;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_MAGICAL;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_NORMAL;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_RARE;
import static mho.core.common.CustomItemRarity.DISPLAY_NAME_UNCOMMON;
import static mho.core.common.CustomItemRarity.EPIC;
import static mho.core.common.CustomItemRarity.JUNK;
import static mho.core.common.CustomItemRarity.LEGENDARY;
import static mho.core.common.CustomItemRarity.MAGICAL;
import static mho.core.common.CustomItemRarity.NORMAL;
import static mho.core.common.CustomItemRarity.RARE;
import static mho.core.common.CustomItemRarity.UNCOMMON;
import net.minecraft.item.EnumRarity;
import net.minecraftforge.client.EnumHelperClient;

public class ClientProxy extends CommonProxy
{	
    @Override
    public void registerTextures() {}
    
    @Override
    public void registerRenderThings() {}
    
    @Override
    public void registerRenderEntity() {}
   
    @Override
    public void initCustomRarityTypes() {
        EnumHelperClient.addRarity(JUNK, COLOR_JUNK, DISPLAY_NAME_JUNK);
        EnumHelperClient.addRarity(NORMAL, COLOR_NORMAL, DISPLAY_NAME_NORMAL);
        EnumHelperClient.addRarity(UNCOMMON, COLOR_UNCOMMON, DISPLAY_NAME_UNCOMMON);
        EnumHelperClient.addRarity(MAGICAL, COLOR_MAGICAL, DISPLAY_NAME_MAGICAL);
        EnumHelperClient.addRarity(RARE, COLOR_RARE, DISPLAY_NAME_RARE);
        EnumHelperClient.addRarity(EPIC, COLOR_EPIC, DISPLAY_NAME_EPIC);
        EnumHelperClient.addRarity(LEGENDARY, COLOR_LEGENDARY, DISPLAY_NAME_LEGENDARY);
    }

    @Override
    public EnumRarity getCustomRarityType(String customRarity) {
        for (EnumRarity rarity : EnumRarity.class.getEnumConstants()) {
            if (rarity.name().equals(customRarity))
                return rarity;
        }
        return EnumRarity.common;
    }
    
    @Override
	public void registerRenderInformation() {}
    
    /* in 1.5
    @Override
    public void initCapes() {
    	DeveloperCapesAPI.getInstance().init("http://www.mhonline.fr/data/cape/cape.txt");
    }
    */
}
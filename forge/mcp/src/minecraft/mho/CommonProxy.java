package mho;

import mho.core.event.ServerTickEventHandler;
import net.minecraft.item.EnumRarity;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {
	
	public void registerTextures() {}

    public void registerRenderEntity() {}
   
    public void initCustomRarityTypes() {}
    
    public EnumRarity getCustomRarityType(String customRarity)
    {
        return null;
    }
    
    public void registerServerTickHandler()
	 {
    	TickRegistry.registerTickHandler(new ServerTickEventHandler(), Side.SERVER);
	 }

	public void registerRenderThings() {}

	public void registerRender() {}

	public void registerRenderInformation() {}

	public void initCapes() {}
}

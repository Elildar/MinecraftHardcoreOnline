package mho.common;

import net.minecraft.item.EnumRarity;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {
	
	public void registerTextures()
    {
        
    }

    public void registerRenderEntity()
    {
 
    }
   
    public void initCustomRarityTypes() {

    }
    
    public EnumRarity getCustomRarityType(String customRarity) {

        return null;
    }
    
    public void registerServerTickHandler()
	 {
	  TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	 }

	public void registerRenderThings() {
		// TODO Auto-generated method stub
		
	}

	public void registerRender() {
		// TODO Auto-generated method stub
		
	}

	public void registerRenderInformation() {
		// TODO Auto-generated method stub
		
	}

	public void initCapes() {
		// TODO Auto-generated method stub
		
	}
}

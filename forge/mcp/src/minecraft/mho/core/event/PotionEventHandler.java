package mho.core.event;

import mho.Mho;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PotionEventHandler {

	@ForgeSubscribe
	public void onEntityUpdate(LivingUpdateEvent event) 
	{
		/**Popo Effet potion WaterWalk**/
		if (event.entityLiving.isPotionActive(Mho.effectPotionWaterWalk)) 
		{	
			int x = (int) Math.floor(event.entityLiving.posX);
			int y = (int) (event.entityLiving.posY - event.entityLiving.getYOffset());
			int z = (int) Math.floor(event.entityLiving.posZ);
			
			if (event.entityLiving.worldObj.getBlockId(x, y - 1, z) == 9 && event.entityLiving.worldObj.getBlockId(x, y, z) == 0) 
			{
				if (event.entityLiving.motionY < 0 && event.entityLiving.boundingBox.minY < y) 
				{
					event.entityLiving.motionY = 0;
					//event.entityLiving.landMovementFactor *= 1;
					event.entityLiving.fallDistance = 0;
					event.entityLiving.onGround = true;
					
					if (event.entityLiving.isSneaking()) 
					{
						event.entityLiving.motionY -= 0.1F;
					}
				}
			}
		}
		
		/**Effet potion LavaWalk**/
		if (event.entityLiving.isPotionActive(Mho.effectPotionLavaWalk)) 
		{
			int x = (int) Math.floor(event.entityLiving.posX);
			int y = (int) (event.entityLiving.posY - event.entityLiving.getYOffset());
			int z = (int) Math.floor(event.entityLiving.posZ);
			
			if (event.entityLiving.worldObj.getBlockId(x, y - 1, z) == 11 && event.entityLiving.worldObj.getBlockId(x, y, z) == 0) 
			{
				if (event.entityLiving.motionY < 0 && event.entityLiving.boundingBox.minY < y) 
				{
					event.entityLiving.motionY = 0;
					//event.entityLiving.landMovementFactor *= 1;
					event.entityLiving.fallDistance = 0;
					event.entityLiving.onGround = true;
					
						if (event.entityLiving.isSneaking()) 
						{
							event.entityLiving.motionY -= 0.1F;
						}
				}
			}
		}
		
		/**Effet potion NOFall**/
		if (event.entityLiving.isPotionActive(Mho.effectPotionNoFall)) 
		{
			event.entityLiving.fallDistance = 0;
		}
	}
}

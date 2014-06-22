package mho.core.event;

import mho.Mho;
import mho.block.deco.BlockSaplingMho;
import net.minecraft.block.Block;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BonemealEventHandler {

	@ForgeSubscribe
	public void onUseBonemeal(BonemealEvent event)
	{
		//int meta = event.world.getBlockMetadata(event.X, event.Y, event.Z);

		if (event.ID == Mho.mysteriousSapling.blockID)
		{
			event.setResult(Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.30D) {
					((BlockSaplingMho)Mho.mysteriousSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}
		else if (event.ID == Mho.darkSapling.blockID)
			{
				event.setResult(Result.ALLOW);

				if (!event.world.isRemote)
				{
					if (event.world.rand.nextFloat() < 0.30D) {
						((BlockSaplingMho)Mho.darkSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
					}
				}
			}
			else if (event.ID == Mho.mysteriousGrassBlock.blockID)
		{
            label102:
            for (int i1 = 0; i1 < 128; ++i1)
            {
            	int j1 = event.X;
            	int k1 = event.Y + 1;
                int l1 = event.Z;

                for (int i2 = 0; i2 < i1 / 16; ++i2)
                {
                    j1 += event.world.rand.nextInt(3) - 1;
                    k1 += (event.world.rand.nextInt(3) - 1) * event.world.rand.nextInt(3) / 2;
                    l1 += event.world.rand.nextInt(3) - 1;
                    
                    if (event.world.getBlockId(j1, k1 - 1, l1) != Mho.mysteriousGrassBlock.blockID || event.world.isBlockNormalCube(j1, k1, l1))
                    {
                        continue label102;
                    }
                }
			
				if (event.world.getBlockId(j1, k1, l1) == 0)
				{
                    if (Block.tallGrass.canBlockStay(event.world, j1, k1, l1))
                    {
                    	int rand = event.world.rand.nextInt(10);

        				switch (rand)
        				{
        				case 0: // Mysterious Flower
                        	event.world.setBlock(j1, k1, l1, Mho.mysteriousFlower.blockID, 1, 3);
        					break;

        				case 1: // Mysterious Plant Purple
                        	event.world.setBlock(j1, k1, l1, Mho.mysteriousPlantPurple.blockID, 1, 3);
        					break;

        				case 2: // Mysterious Plant
                        	event.world.setBlock(j1, k1, l1, Mho.mysteriousPlant.blockID, 1, 3);
        					break;

        				case 3: // Nothing
        				case 4:
        					break;

        				default: // Mysterious Grass
                        	event.world.setBlock(j1, k1, l1, Mho.mysteriousGrass.blockID, 1, 3);
        					break;
        				}
                    }
				}
			}
		}
		else if (event.ID == Mho.greyRockGrass.blockID || event.ID == Mho.brownRockGrass.blockID || event.ID == Mho.darkRockGrass.blockID || event.ID == Mho.redGrassBlock.blockID)
		{
            label102:
            for (int i1 = 0; i1 < 128; ++i1)
            {
            	int j1 = event.X;
            	int k1 = event.Y + 1;
                int l1 = event.Z;

                for (int i2 = 0; i2 < i1 / 16; ++i2)
                {
                    j1 += event.world.rand.nextInt(3) - 1;
                    k1 += (event.world.rand.nextInt(3) - 1) * event.world.rand.nextInt(3) / 2;
                    l1 += event.world.rand.nextInt(3) - 1;
                    
                    if ((event.world.getBlockId(j1, k1 - 1, l1) != Block.grass.blockID &&
                       	 event.world.getBlockId(j1, k1 - 1, l1) != Mho.greyRockGrass.blockID &&
                    	 event.world.getBlockId(j1, k1 - 1, l1) != Mho.brownRockGrass.blockID &&
                    	 event.world.getBlockId(j1, k1 - 1, l1) != Mho.redGrassBlock.blockID &&
                    	 event.world.getBlockId(j1, k1 - 1, l1) != Mho.darkRockGrass.blockID) || event.world.isBlockNormalCube(j1, k1, l1))
                    {
                        continue label102;
                    }
                }
			
				if (event.world.getBlockId(j1, k1, l1) == 0)
				{
                    if (event.world.rand.nextInt(10) != 0)
                    {
                        if (Block.tallGrass.canBlockStay(event.world, j1, k1, l1))
                        {
                        	event.world.setBlock(j1, k1, l1, Block.tallGrass.blockID, 1, 3);
                        }
                    }
                    else
                    {
                        ForgeHooks.plantGrass(event.world, j1, k1, l1);
                    }
				}
			}
		}
		else if (event.ID == Block.dirt.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Block.grass.blockID, 1, 3);
		}
		else if (event.ID == Mho.mysteriousDirt.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Mho.mysteriousGrassBlock.blockID, 1, 3);
		}
		else if (event.ID == Mho.darkDirt.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Mho.darkGrassBlock.blockID, 1, 3);
		}
		else if (event.ID == Mho.greyRock.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Mho.greyRockGrass.blockID, 1, 3);
		}
		else if (event.ID == Mho.brownRock.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Mho.brownRockGrass.blockID, 1, 3);
		}
		else if (event.ID == Mho.darkRock.blockID)
		{
			event.setResult(Result.ALLOW);
        	event.world.setBlock(event.X, event.Y, event.Z, Mho.darkRockGrass.blockID, 1, 3);
		}
		else if (event.ID == Mho.redRockBigLine.blockID || event.ID == Mho.redRockLines.blockID)
		{
			event.setResult(Result.ALLOW);
			event.world.setBlock(event.X, event.Y, event.Z, Mho.redGrassBlock.blockID, 1, 3);
		}
	}
}

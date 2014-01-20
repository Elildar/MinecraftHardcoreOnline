package mho.itemblock;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockDoubleCrate extends Item {

	public ItemBlockDoubleCrate(int par1) {
		super(par1);
        this.setCreativeTab(Mho.tabMhoBlocks);
	}

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
    	this.itemIcon = iconRegister.registerIcon(Mho.modid + ":doubleCrateItemBlock");
    }
	
    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l, float m, float n, float o)
    {
        if (l != 1)
        {
            return false;
        }
        else
        {
            ++j;
            if (entityplayer.canPlayerEdit(i, j, k, l, itemstack) && entityplayer.canPlayerEdit(i, j + 1, k, l, itemstack))
            {
            	Block block = Mho.doubleCrateBlock;
                if (!block.canPlaceBlockAt(world, i, j, k))
                {
                    return false;
                }
                else
                {
                    world.setBlock(i, j, k, block.blockID, 0, 3);
                    world.setBlock(i, j + 1, k, block.blockID, 1, 3);
                    --itemstack.stackSize;
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
}

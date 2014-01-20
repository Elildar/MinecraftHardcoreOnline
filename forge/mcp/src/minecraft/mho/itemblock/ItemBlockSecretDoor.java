package mho.itemblock;

import mho.Mho;
import mho.item.ItemMho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBlockSecretDoor extends ItemMho {

    private Material doorMaterial;
    
	public ItemBlockSecretDoor(int id, Material material, String name, String info) {
		super(id, name, 1, info, 2, false);
        this.doorMaterial = material;
        this.setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO" + name);
		this.setTextureName(Mho.modid + ":" + name);
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
            Block block;
            
            if (this.doorMaterial == Material.wood)
            {
                block = Mho.blockSecretDoorWood;
            }
            else
            {
                block = Mho.blockSecretDoorIron;
            }
            
            if (entityplayer.canPlayerEdit(i, j, k, l, itemstack) && entityplayer.canPlayerEdit(i, j + 1, k, l, itemstack))
            {
                if (!block.canPlaceBlockAt(world, i, j, k))
                {
                    return false;
                }
                else
                {
                    int i1 = MathHelper.floor_double((entityplayer.rotationYaw + 180.0F) * 4.0F / 360.0F - 0.5D) & 3;
                    ItemDoor.placeDoorBlock(world, i, j, k, i1, block);
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

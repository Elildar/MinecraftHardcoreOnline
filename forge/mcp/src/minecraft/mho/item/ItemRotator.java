package mho.item;

import java.util.Map;

import mho.block.generic.BlockAnvilMho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRotator extends ItemMho {

    private Map<Integer, String> allowedBlocks;
    
	public ItemRotator(int id, String name, String info, Map<Integer, String> rotatorAllowedBlocks) {
		super(id, name, 1, info, 3, false);
		this.allowedBlocks = rotatorAllowedBlocks;
        this.setMaxDamage(64);
	}

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            int id = par3World.getBlockId(par4, par5, par6);
            int meta = par3World.getBlockMetadata(par4, par5, par6);
            int nextMeta = getNextMeta(id, meta);
            if (meta != nextMeta) {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, id, nextMeta);
            }
        }
		return false;
    }

	private int getNextMeta(int id, int meta) {
		String[] metaGroupList;
		if(allowedBlocks.containsKey(id)) {
			metaGroupList = allowedBlocks.get(id).split(";");
			return getNextMeta(metaGroupList, meta);
		}
		else if(Block.blocksList[id] instanceof BlockStairs)
			return getNextMeta(new String[]{"0,1,2,3,4,5,6,7"}, meta);
		else if(Block.blocksList[id] instanceof BlockStep)
			return getNextMeta(new String[]{"0,8"}, meta);
		else if(Block.blocksList[id] instanceof BlockAnvilMho)
			return getNextMeta(new String[]{"0,1"}, meta);
		else if(Block.blocksList[id] instanceof BlockLog)
			return getNextMeta(new String[]{"0,4,8,12","1,5,9,13","2,6,10,14","3,7,11,15"}, meta);
		return meta;
	}

	private int getNextMeta(String[] metaGroupList, int meta) {
		for(int i=0; i<metaGroupList.length; i++) {
			String[] metaList = metaGroupList[i].split(",");
			for(int j=0; j<metaList.length; j++) {
				if(Integer.parseInt(metaList[j]) == meta)
					return Integer.parseInt(metaList[(j+1)%metaList.length]);
			}
		}
		return meta;
	}

    /**
     * Called to actually place the block, after the location is determined
     * and all permission checks have been made.
     *
     * @param stack The item stack that was used to place the block. This can be changed inside the method.
     * @param player The player who is placing the block. Can be null if the block is not being placed by a player.
     * @param side The side the player (or machine) right-clicked on.
     */
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int id, int metadata)
    {
       if (!world.setBlock(x, y, z, id, metadata, 3))
       {
           return false;
       }
       return true;
    }
}

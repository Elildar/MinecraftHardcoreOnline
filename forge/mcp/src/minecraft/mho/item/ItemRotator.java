package mho.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRotator extends ItemMho {

	public ItemRotator(int id, String name, String info) {
		super(id, name, 1, info, 3, false);
	}

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.capabilities.isCreativeMode)
        {
            int id = par3World.getBlockId(par4, par5, par6);
            int meta = par3World.getBlockMetadata(par4, par5, par6);
            int nextMeta = getNextMeta(id, meta);
            if (meta != nextMeta)
                return par3World.setBlockMetadataWithNotify(par4, par5, par6, nextMeta, 3);
        }
		return false;
    }

	private int getNextMeta(int id, int meta) {
		return (meta + 1) % 16;
	}

}

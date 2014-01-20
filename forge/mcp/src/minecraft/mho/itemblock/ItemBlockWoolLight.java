package mho.itemblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockWoolLight extends ItemBlock {

	public ItemBlockWoolLight(int par1) {
		super(par1);
		this.setMaxDamage(0); //Stops bad things from happening
        this.setHasSubtypes(true); //Tells it that it has metadata versions
	}

    public Icon getIconFromDamage(int par1)
    {
        return Block.cloth.getIcon(2, BlockColored.getBlockFromDye(par1));
    }

	public int getMetadata(int par1) //Returns the metadata value
	{
	         return par1;
	}

    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return super.getUnlocalizedName() + "." + ItemDye.dyeColorNames[BlockColored.getBlockFromDye(par1ItemStack.getItemDamage())];
    }
}

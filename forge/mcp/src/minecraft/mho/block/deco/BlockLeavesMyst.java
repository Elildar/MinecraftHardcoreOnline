package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockLeavesMyst extends BlockLeavesMho {

	public BlockLeavesMyst(int id, String name) {
		super(id, name);
		this.setLightValue(0.3F);
	}

    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
    	super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        if (!par1World.isRemote && par1World.rand.nextInt(2) == 0)
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Mho.mysteriousDust.itemID, 1, 0));
    }
}

package mho.block.build;

import java.util.ArrayList;

import mho.Mho;
import mho.block.generic.BlockMho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockCristalMho extends BlockMho {

	public BlockCristalMho(int ID, String name) {
		super(ID, Material.glass, name);
		this.setStepSound(Block.soundGlassFootstep);
	}

    /**
     * This returns a complete list of items dropped from this block.
     */
	@Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        int count = world.rand.nextInt(4) + 1;
        for(int i = 0; i < count; i++)
        {
            ret.add(new ItemStack(Mho.cristalLittle.blockID, 1, 0));
        }
        
        count = world.rand.nextInt(3);
        for(int i = 0; i < count; i++)
        {
            ret.add(new ItemStack(Mho.cristalBig.blockID, 1, 0));
        }
        return ret;
    }
}

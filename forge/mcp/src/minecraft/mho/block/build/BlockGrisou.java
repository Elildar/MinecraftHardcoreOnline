package mho.block.build;

import mho.Mho;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockGrisou extends BlockStone 
{
	
	public BlockGrisou(int par1, Material Material, String name) 
	{
	    super(par1);
		setCreativeTab(Mho.tabMhoBlocks);
		this.setUnlocalizedName("MHO"+name);
	}
	
    public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
    {
        var1.createExplosion((Entity)null, (double)var2, (double)var3, (double)var4, 1.2F, false);
    }
}

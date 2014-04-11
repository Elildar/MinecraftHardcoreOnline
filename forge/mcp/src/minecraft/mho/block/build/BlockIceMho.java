package mho.block.build;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.block.material.Material;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class BlockIceMho extends BlockIce {

	public BlockIceMho(int ID, String name) {
		super(ID);
        this.slipperiness = 0.6F;
		this.setHardness(0.5F);
		this.setLightOpacity(3);
		this.setStepSound(soundGlassFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName("ice");
	}

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.provider.isHellWorld)
        {
            par1World.setBlockToAir(par2, par3, par4);
            return;
        }
    }

}

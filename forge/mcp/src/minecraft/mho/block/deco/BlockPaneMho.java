package mho.block.deco;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class BlockPaneMho extends BlockPane {

	public BlockPaneMho(int par1, Material par2Material, String texture, String name, boolean canDrop) {
		super(par1, Mho.modid + ":" + texture, Mho.modid + ":paneSide", par2Material, canDrop);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(Block.soundGlassFootstep); 
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name);
	}
}

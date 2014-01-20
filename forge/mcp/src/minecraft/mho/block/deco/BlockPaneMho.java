package mho.block.deco;

import mho.Mho;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class BlockPaneMho extends BlockPane {

	public BlockPaneMho(int par1, String texture, String name) {
		super(par1, Mho.modid + ":" + texture, Mho.modid + ":paneSide", Material.glass, false);
		setLightOpacity(0);
		setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name);
	}
}

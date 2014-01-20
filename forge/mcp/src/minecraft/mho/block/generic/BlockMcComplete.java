package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMcComplete extends Block 
{
	private final Block modelBlock;
	int metadata;
	
	public BlockMcComplete(int par1, Block par2Block, int meta, String name) 
	{
	    super(par1, par2Block.blockMaterial);
	    this.modelBlock = par2Block;
	    this.metadata = meta;
	    this.setHardness(1.0F); //How hard the block is to break
		this.setResistance(1.0F); //How well the block resists explosions
		this.setStepSound(par2Block.stepSound); //The sound the block makes when you walk on it as well as place or break it
		this.setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		this.setUnlocalizedName("MHO"+name);
	}

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta)
    {
		return this.modelBlock.getIcon(2, metadata);
    }
}

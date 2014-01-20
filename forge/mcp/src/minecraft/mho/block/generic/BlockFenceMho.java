package mho.block.generic;

import java.util.List;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFenceMho extends BlockFence {

	private final Block modelBlock;
	int metadata;
	
	public BlockFenceMho(int par1, Block par2Block, int meta, String name) {
		super(par1, "dirt", par2Block.blockMaterial);
		this.modelBlock = par2Block;
		this.metadata = meta;
        this.setHardness(par2Block.blockHardness);
        this.setResistance(par2Block.blockResistance / 3.0F);
        this.setStepSound(par2Block.stepSound);
        this.setCreativeTab(Mho.tabMhoFences);
        this.setLightOpacity(2);
		this.setUnlocalizedName("MHO"+name);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta)
    {
		if (modelBlock == Block.wood) {
			return this.modelBlock.getIcon(2, metadata);
		}
		return this.modelBlock.getIcon(side, metadata);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
}

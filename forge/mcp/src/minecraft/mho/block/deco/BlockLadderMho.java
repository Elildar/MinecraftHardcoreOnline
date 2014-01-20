package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLadderMho extends BlockLadder
{
    public BlockLadderMho(int par1, String name)
    {
        super(par1);
        this.setCreativeTab(Mho.tabMhoDecorations);
        this.setStepSound(Block.soundLadderFootstep);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
    }

    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
	    }
}
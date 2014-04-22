package mho.block.generic;

import java.util.List;
import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogMho extends BlockLog {
	
	private Icon topIcon;
	private Icon faceIcon;
	
	public BlockLogMho(int par1, String name) {
		super(par1);
		this.setHardness(2.0F);
		this.setStepSound(soundWoodFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
    
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Face");
    }

    /**
     * The icon for the side of the block.
     */
    @SideOnly(Side.CLIENT)
    @Override
    protected Icon getSideIcon(int par1)
    {
        return this.faceIcon;
    }

    /**
     * The icon for the tops and bottoms of the block.
     */
    @SideOnly(Side.CLIENT)
    @Override
    protected Icon getEndIcon(int par1)
    {
        return this.topIcon;
    }
}

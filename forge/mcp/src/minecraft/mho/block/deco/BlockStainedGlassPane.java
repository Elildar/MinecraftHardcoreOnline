package mho.block.deco;

import java.util.List;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStainedGlassPane extends BlockPane {

	private Icon sideIcon;
	public Icon[] iconArray;
	
	public BlockStainedGlassPane(int par1) {
		super(par1, "vitrail_0", "vitrail_0", Material.glass, true);
		this.setHardness(0.3F);
		this.setStepSound(Block.soundGlassFootstep); 
		this.setCreativeTab(Mho.tabMhoDecorations);
	}

	public int damageDropped(int i) //Tells it what block it drops and also for creative mode pick block
	{
		return i;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.sideIcon = par1IconRegister.registerIcon(Mho.modid + ":paneSide");
        this.iconArray = new Icon[16];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Mho.modid + ":" + "vitrail_" + i);
        }
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	return this.iconArray[meta];
    }
	
	@SideOnly(Side.CLIENT)

    /**
     * Returns the texture index of the thin side of the pane.
     */
    public Icon getSideTextureIndex()
    {
        return this.sideIcon;
    }
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) //Adds the metadata blocks to the creative inventory
	{
		for (int var4 = 0; var4 < 16; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}

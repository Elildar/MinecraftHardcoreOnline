package mho.block.build;

import java.util.List;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMetaWoolLight extends Block {
	
	private Icon[] iconArray;
	
	public BlockMetaWoolLight(int ID){
		super(ID,Material.cloth); //The ID and material
		setHardness(0.3F); //How hard the block is
		setResistance(0.1F); //How well the block resists explosions
		setStepSound(Block.soundClothFootstep); //The sounds the block makes
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		setLightValue(1.0F);
	}
	public int getBlockTextureFromSideAndMetadata(int par1, int par2){ //The different textures fo different metadatas
		if (par2 == 0)
        {
            return 64;
        }
        else
        {
            par2 = ~(par2 & 15);
            return 113 + ((par2 & 8) >> 3) + (par2 & 7) * 16;
        }
	}

	public int damageDropped(int i){ //Tells it what block it drops and also for creative mode pick block
		return i;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[16];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon("wool_colored_" + ItemDye.dyeItemNames[BlockColored.getDyeFromBlock(i)]);
        }
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	return this.iconArray[meta];
    }
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) //Adds the metadata blocks to the creative inventory
	{
		for (int n = 0; n < 16; ++n)
		{
			par3List.add(new ItemStack(this, 1, n));
		}
	}
}

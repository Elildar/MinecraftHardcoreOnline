package mho.block;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStep;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class StepMho extends BlockStep {
	
	private final Block modelBlock;
	
	public StepMho(int par1, Block par2Block, String Name) {
		super(par1, false);
		setResistance(1.0F);
		setHardness(1.0F);
		setCreativeTab(Mho.tabMhoStep); //The tab it appears in
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
		modelBlock = par2Block;
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + modelBlock.getTextureName());
    }
	*/
	@SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
		return this.modelBlock.getIcon(side, meta);
    }
	
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
		par3List.add(new ItemStack(par1, 1, 0));
    }
	
	public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
}

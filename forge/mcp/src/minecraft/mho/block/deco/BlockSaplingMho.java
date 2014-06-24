package mho.block.deco;

import java.util.List;
import java.util.Random;

import mho.Mho;
import mho.world.WorldGenBigTreeMho;
import mho.world.WorldGenTreesMho;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSaplingMho extends BlockSapling {

	private final int[] woodIds;
	private final int[] leaveIds;
	
	public BlockSaplingMho(int id, String name, int[] woodIds, int[] leaveIds) {
		super(id);
        this.woodIds = woodIds;
        this.leaveIds = leaveIds;
		this.setHardness(0.0F);
		this.setStepSound(soundGrassFootstep);
        this.setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return this.blockIcon;
    }

    @Override
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;

        int meta = par1World.getBlockMetadata(par2, par3, par4) & 3;
        WorldGenerator object = new WorldGenTreesMho(true, 5,  this.woodIds, this.leaveIds);

        if (par5Random.nextInt(10) == 0)
        {
            object = new WorldGenBigTreeMho(true, 5,  this.woodIds, this.leaveIds);
        }

        par1World.setBlock(par2, par3, par4, 0, 0, 4);
        if (!object.generate(par1World, par5Random, par2, par3, par4))
        {
            par1World.setBlock(par2, par3, par4, this.blockID, meta, 4);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}

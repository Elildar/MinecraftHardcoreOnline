package mho.block.build;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRockGrass extends Block {
	
	private Icon topIcon;
	private Icon botIcon;
	private Icon faceIcon;
	
	public BlockRockGrass(int par1, String name) {
		super(par1, Material.rock);
        this.setTickRandomly(true);
        this.setHardness(1.0F); //How hard the block is to break
        this.setResistance(1.0F); //How well the block resists explosions
        this.setStepSound(super.soundStoneFootstep); //The sound the block makes when you walk on it as well as place or break it
        this.setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
        this.setUnlocalizedName("MHO"+name+"Grass");
        this.setTextureName(name);
	}

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, this.blockID == Mho.greyRockGrass.blockID ? Mho.greyRock.blockID :
              	  (this.blockID == Mho.brownRockGrass.blockID ? Mho.brownRock.blockID :
                	  (this.blockID == Mho.darkRockGrass.blockID ? Mho.darkRock.blockID : this.blockID)));
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        int m1 = par1World.getBlockId(i1, j1, k1);
                    	if(m1 == Block.dirt.blockID)
                            par1World.setBlock(i1, j1, k1, Block.grass.blockID);
                    	if(m1 == Mho.greyRock.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.greyRockGrass.blockID);
                    	if(m1 == Mho.greyRock.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.greyRockGrass.blockID);
                    	if(m1 == Mho.brownRock.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.brownRockGrass.blockID);
                    	if(m1 == Mho.darkRock.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.darkRockGrass.blockID);
                    	if(m1 == Mho.mysteriousDirt.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.mysteriousGrassBlock.blockID);
                    	if(m1 == Mho.darkDirt.blockID)
                            par1World.setBlock(i1, j1, k1, Mho.darkGrassBlock.blockID);
                    }
                }
            }
        }
    }
    
    public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
        EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);

        switch (plantType)
        {
            case Desert: return true;
            case Plains: return true;
        }

        return super.canSustainPlant(world, x, y, z, direction, plant);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == Mho.greyRockGrass.blockID ? Mho.greyRock.blockID :
        	  (this.blockID == Mho.brownRockGrass.blockID ? Mho.brownRock.blockID :
        	  (this.blockID == Mho.darkRockGrass.blockID ? Mho.darkRock.blockID : this.blockID));
    }

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
         this.topIcon = iconRegister.registerIcon(Mho.modid + ":rockGrassTop");
         this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Bot");
         this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"GrassFace");
    }

/*
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int l = 0;
        int i1 = 0;
        int j1 = 0;

        for (int k1 = -1; k1 <= 1; ++k1)
        {
            for (int l1 = -1; l1 <= 1; ++l1)
            {
                int i2 = par1IBlockAccess.getBiomeGenForCoords(par2 + l1, par4 + k1).getBiomeGrassColor();
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }

        return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
        return side == 1 ? Block.grass.getBlockTextureFromSide(side) : (side == 0 ? this.botIcon : this.faceIcon);
    }
*/
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
        return side == 1 ? this.topIcon : (side == 0 ? this.botIcon : this.faceIcon);
    }
}

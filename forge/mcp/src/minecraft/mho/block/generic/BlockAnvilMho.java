package mho.block.generic;

import java.util.List;
import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAnvilMho extends BlockAnvil {

	private final Block modelBlock;
	int metadata;
	
	public BlockAnvilMho(int par1, Block par2Block, int meta, String name) {
		super(par1);
		this.modelBlock = par2Block;
		this.metadata = meta;
        this.setHardness(par2Block.blockHardness);
        this.setResistance(par2Block.blockResistance / 2.0F);
        this.setStepSound(par2Block.stepSound);
        this.setCreativeTab(Mho.tabMhoFences);
		this.setLightOpacity(1);
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
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        int var7 = par1World.getBlockMetadata(par2, par3, par4) >> 2;
        ++var6;
        var6 %= 4;

        if (var6 == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | var7 << 2, 4);
        }

        if (var6 == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | var7 << 2, 4);
        }

        if (var6 == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | var7 << 2, 4);
        }

        if (var6 == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | var7 << 2, 4);
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 35;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1 >> 2;
    }
    
    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
    	
        int var5 = par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 3;

        if (var5 != 3 && var5 != 1)
        {
            this.setBlockBounds(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
            
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
        }
    }
    
    public int tickRate()
    {
    	return 10;
    }
    
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {}
    
    private void tryToFall(World par1World, int par2, int par3, int par4) {}
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {}
    
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {}
    
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
}

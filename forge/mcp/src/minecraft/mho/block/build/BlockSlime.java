package mho.block.build;

import mho.Mho;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlime extends BlockGlass {	

	private boolean localFlag = false;
	
	public BlockSlime(int ID, String name) {
		super(ID, Material.cloth, true);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(super.soundClothFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setLightOpacity(100);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}	

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
    
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() //Put 0 for fully transparent or opaque blocks, and 1 for semi-transparent
	{
	         return 1;
	}

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.localFlag && var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
	
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) 
    {
    	if (par5Entity instanceof EntityLiving) {
    		((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 80, 4));
    		((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Mho.effectPotionNoFall.id, 100, 4));
    	}
    } 
}
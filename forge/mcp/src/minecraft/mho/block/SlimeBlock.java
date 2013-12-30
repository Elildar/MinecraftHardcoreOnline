package mho.block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SlimeBlock extends Block {	
	
	public SlimeBlock(int par1, int par2, Material par3Material, String Name)
	{
		super(par1, par3Material);
		this.setCreativeTab(Mho.tabMhoBlocks);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}	

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
	    }
    
    public boolean isOpaqueCube() 
    { 
    	return false; 
    }
    
    public int getRenderBlockPass() 
    { 
    	return 1; 
    }
    
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) 
    {
    	if (par5Entity instanceof EntityLiving) {
    		((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 80, 4));
    		((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Mho.effectPotionNoFall.id, 100, 4));
    	}
    }
       
}
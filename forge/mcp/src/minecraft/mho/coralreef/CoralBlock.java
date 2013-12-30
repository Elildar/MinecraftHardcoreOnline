package mho.coralreef;

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

public class CoralBlock extends Block 
{

	public CoralBlock(int par1, Material par3Material, String Name)
    {
        super(par1, par3Material);
		this.setCreativeTab(Mho.tabMhoCoral);
		setStepSound(Block.soundGrassFootstep);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
		setLightValue(0.3F);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}

package mho.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler 
{
	
	@SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) 
    {
    	try 
        {
    		event.manager.addSound("mho:mob.magenoir.ogg");
    		event.manager.addSound("mho:div.peluche.ogg");
        	/* in 1.5 :
            event.manager.soundPoolSounds.addSound("mob/magenoir.ogg", Mho.class.getResource("/mho/ressources/sound/mob/magenoir.ogg"));
            event.manager.soundPoolSounds.addSound("div/peluche.ogg", Mho.class.getResource("/mho/ressources/sound/div/peluche.ogg"));
            */
        
        } 
        catch (Exception e)
        {
            System.err.println("Failed to register one or more sounds.");
        }
    }
}

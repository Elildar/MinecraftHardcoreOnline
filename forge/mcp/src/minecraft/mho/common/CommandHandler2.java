package mho.common;

import mho.command.CommandPosition;
import mho.command.CommandVersion;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommandHandler2 
{
    public static void initCommands(FMLServerStartingEvent event) 
    {

        event.registerServerCommand(new CommandVersion());
        /**event.registerServerCommand(new CommandPosition());**/
    }
}

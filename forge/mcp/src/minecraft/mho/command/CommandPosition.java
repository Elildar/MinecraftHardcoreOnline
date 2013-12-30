package mho.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;

public class CommandPosition extends CommandBase {

	private List aliases;
	public CommandPosition()
	{
		this.aliases = new ArrayList();
	    this.aliases.add("mapos");
	}
	
	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}
	
	@Override
	public String getCommandName() {
		return "ici";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/ici";
	}

    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    
	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		if(var1 instanceof EntityPlayer)
		{
		EntityPlayerMP player = (EntityPlayerMP)var1;
		
		String worldnameresult;
		
		String worldname = player.worldObj.getWorldInfo().getWorldName();
			if (worldname == "world")
			{
				worldnameresult = "sur Heliora";
			}
			else if (worldname == "world_donjon")
			{
				worldnameresult = "dans un donjon";
			}
			else if (worldname == "world_mine")
			{
				worldnameresult = "sur la map mine";
			}
			else
			{
				worldnameresult = "sur un monde inconnu";
			}
		
		player.addChatMessage("[" + player.username + "] Ma position " + worldnameresult + " : " + MathHelper.floor_double(player.posX) + ", " + MathHelper.floor_double(player.posY) + ", " + MathHelper.floor_double(player.posZ));
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		return true;
	}

}

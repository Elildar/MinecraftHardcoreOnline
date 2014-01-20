package mho.core.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class CommandVersion extends CommandBase {

	@Override
	public String getCommandName() {
		return "mmho";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/mmho";
	}

    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    
	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
        var1.sendChatToPlayer(new ChatMessageComponent().addText("Version du mod MMHO : 1.0.0 - Par SoEnguy, xDakota et Elildar"));

	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		return true;
	}
}

package command;

/**
 * 一组宏命令
 *
 * @author Su Jiulong
 * @date 2020/3/10 21:31
 */
public class PartyCommand implements Command {
	private Command[] commands;

	public void setCommands(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		if (commands == null) {
			return;
		}
		for (Command command : commands) {
			command.execute();
		}
	}
}

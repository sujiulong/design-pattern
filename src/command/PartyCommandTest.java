package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:38
 */
public class PartyCommandTest {
	public static void main(String[] args) {
		Operation operation = new Operation(20, 4);
		AddCommand addCommand = new AddCommand(operation);
		SubCommand subCommand = new SubCommand(operation);
		MultiplicationCommand multiplicationCommand = new MultiplicationCommand(operation);
		DivideCommand divideCommand = new DivideCommand(operation);
		Command[] commands = {addCommand, subCommand, multiplicationCommand, divideCommand};

		//一组宏命令
		PartyCommand partyCommand = new PartyCommand();
		partyCommand.setCommands(commands);

		ProcessCommand processCommand = new ProcessCommand();
		processCommand.process(partyCommand);
	}
}

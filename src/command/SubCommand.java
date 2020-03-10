package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:14
 */
public class SubCommand implements Command {
	private Operation operation;

	public SubCommand(Operation operation) {
		this.operation = operation;
	}

	@Override
	public void execute() {
		operation.sub();
	}
}

package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:34
 */
public class DivideCommand implements Command {
	private Operation operation;

	public DivideCommand(Operation operation) {
		this.operation = operation;
	}

	@Override
	public void execute() {
		operation.divide();
	}
}

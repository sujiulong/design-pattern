package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:35
 */
public class MultiplicationCommand implements Command {
	private Operation operation;

	public MultiplicationCommand(Operation operation) {
		this.operation = operation;
	}

	@Override
	public void execute() {
		operation.multiplication();
	}
}

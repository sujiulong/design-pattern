package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:13
 */
public class AddCommand implements Command {
	private Operation operation;

	public AddCommand(Operation operation) {
		this.operation = operation;
	}

	@Override
	public void execute() {
		operation.add();
	}
}

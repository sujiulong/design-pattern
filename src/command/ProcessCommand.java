package command;

/**
 * 命令的执行者
 *
 * @author Su Jiulong
 * @date 2020/3/10 21:08
 */
public class ProcessCommand {
	/**
	 * 命令接口
	 */
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行命令的方法
	 *
	 * @param command 待执行的具体命令
	 */
	public void process(Command command) {
		command.execute();
	}

	/**
	 * 可重复执行指定命令
	 */
	public void process() {
		this.command.execute();
	}
}

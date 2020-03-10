package command;

/**
 * 命令模式：将“请求”封装成为对象，以便使用不同的请求、队列或者日志来参数化其他对象。
 * 命令模式也支持撤销操作。将命令的发出者与执行者解耦。
 * 命令的发出者：ProcessCommand对象
 * 命令：实现了Command接口的具体命令
 * 命令的接收者（执行者）：Operation对象
 * 通过命令对象将命令的发出者与执行者解耦。满足开闭原则
 * <p>
 * 命令模式还支持undo、redo操作。只需要在具体命令中记录上一个操作（或者一组操作）即可。
 * 命令模式可只支持宏命令，将一组命令封装在一个命令中，执行自动化操作。
 * <p>
 * 命令模式可用来实现线程池，日志的undo、redo操作。
 * <p>
 * 缺点：如果命令过多，造成很多命令类，增加系统复杂度。
 *
 * @author Su Jiulong
 * @date 2020/3/10 21:15
 */
public class CommandTest {
	public static void main(String[] args) {
		ProcessCommand processCommand = new ProcessCommand();

		Operation operation = new Operation(12, 4);
		AddCommand addCommand = new AddCommand(operation);
		processCommand.process(addCommand);

		SubCommand subCommand = new SubCommand(operation);
		processCommand.setCommand(subCommand);
		processCommand.process();
		processCommand.process();

		//使用lambada表达式实现命令。
		processCommand.process(() -> {
			System.out.println("lambada 表达式命令");
		});
	}
}

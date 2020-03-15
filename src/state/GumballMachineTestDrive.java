package state;

/**
 * 此例子是《head first 设计模式》书中的例子。暂时想不到例子，就用这个了。
 * 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 * 策略模式：更注重是算法的互换，而状态模式注重状态的变更，会将状态变更的规则写好
 * 而策略模式可以在运行时进行算法的更换。
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine =
				new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}

package state;

/**
 * 没有25分的状态
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你插入了一个25美分");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你没有投入25美分，无法退回");
	}

	@Override
	public void turnCrank() {
		System.out.println("你转动了手柄，但没有25美分");
	}

	@Override
	public void dispense() {
		System.out.println("请先支付25美分");
	}

	@Override
	public String toString() {
		return "等待投入25美分";
	}
}

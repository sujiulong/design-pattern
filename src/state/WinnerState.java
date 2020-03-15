package state;

/**
 * 赢家状态：一次获得两颗糖果
 * 10%的概率获得两颗糖果
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("请稍等，我们已经给你一颗口香糖了");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("抱歉，你已经转动过了手柄");
	}

	@Override
	public void turnCrank() {
		System.out.println("再转动也不会多给你口香糖！！！");
	}

	@Override
	public void dispense() {
		System.out.println("很幸运，你的硬币可以换两颗口香糖");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
			return;
		}

		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("糟糕，没有口香糖了！！！");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public String toString() {
		return "发放两颗糖果，因为你是赢家";
	}
}

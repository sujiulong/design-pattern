package state;

/**
 * 售卖状态
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
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
		return "发放一个口香糖";
	}
}

package state;

/**
 * 售罄状态
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("你不能投入25美分，此机器口香糖已经售罄");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你不能退回25美分，因为未投入25美分");
	}

	@Override
	public void turnCrank() {
		System.out.println("你转动了手柄，但机器没有口香糖");
	}

	@Override
	public void dispense() {
		System.out.println("没有口香糖发放");
	}

	@Override
	public String toString() {
		return "口香糖已售罄";
	}
}

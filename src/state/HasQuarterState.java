package state;

import java.util.Random;

/**
 * 有25分的状态
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("您不能再插入另一个25美分");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("25美分已经退回");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("你转动了手柄。。。。。。");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("未发放口香糖");
	}

	@Override
	public String toString() {
		return "等待手柄转动";
	}
}

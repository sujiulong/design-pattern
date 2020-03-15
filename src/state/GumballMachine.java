package state;

/**
 * 口香糖果机器，维护了所有的状态
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = null;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		//初始状态为售罄状态，即没有糖果。（刚安装时）
		state = soldOutState;
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		if (count > 0) {
			state.dispense();
		}
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("一个口香糖滚出了那个槽位");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	@Override
	public String toString() {
		return "\n库存: " + count + " 口香糖"
				+ "\n" + "机器状态：" + state + "\n";
	}
}

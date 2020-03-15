package state;

/**
 * 状态接口
 * 可以将接口改为抽象类，将重复的的方法放到基类中
 *
 * @author Su Jiulong
 * @date 2020/3/15 10:02
 */
public interface State {

	/**
	 * 投入25分，25美分一颗糖果
	 */
	void insertQuarter();

	/**
	 * 退回25分
	 */
	void ejectQuarter();

	/**
	 * 转动手柄
	 */
	void turnCrank();

	/**
	 * 发放糖果
	 */
	void dispense();
}

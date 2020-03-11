package templatemethod;

/**
 * 模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 * <p>
 * 钩子：指模板方法中预留的方法，可以是空实现，或者默认实现，由子类决定是否覆盖。可以让子类方法决定是否挂钩到模板方法中。
 * <p>
 * 什么时候使用钩子？
 * 当部分算法是可选的时候，就可以使用钩子。
 *
 * @author Su Jiulong
 * @date 2020/3/11 21:58
 */
public abstract class BaseFitness {
	final void fitness() {
		changeClothes();
		warmUp();
		exercise();
		bath();
	}

	/**
	 * 更换衣服
	 */
	void changeClothes() {
		System.out.println("换上健身套装");
	}

	/**
	 * 热身运动
	 */
	abstract void warmUp();

	/**
	 * 健身训练
	 */
	abstract void exercise();

	/**
	 * 钩子
	 */
	void bath() {

	}
}

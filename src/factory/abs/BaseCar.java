package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 15:56
 */
public abstract class BaseCar {
	/**
	 * 车名
	 */
	String name = "UNKNOW";
	/**
	 * 玻璃
	 */
	Glass glass;
	/**
	 * 轮子
	 */
	Wheel wheel;

	/**
	 * 组装材料方法
	 */
	abstract void prepare();

	/**
	 * 车运行
	 */
	public void run() {
		prepare();
		System.out.println(name + "正在运行");
	}

	/**
	 * 车停止
	 */
	public void stop() {
		System.out.println(name + "已经停止");
	}
}

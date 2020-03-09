package factory.method;

/**
 * @author Su Jiulong
 * @date 2020/3/9 15:56
 */
public abstract class BaseCar {
	/**
	 * 车名
	 */
	public String name;

	/**
	 * 车运行
	 */
	public abstract void run();

	/**
	 * 车停止
	 */
	public abstract void stop();
}

package singleton;

/**
 * 双重检测：
 * 线程安全、懒加载、非反序列化安全
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:02
 */
public class Singleton4 {

	private Singleton4() {
	}

	/**
	 * 不加 volatile 虚拟机指令重排序可还是会有线程安全问题
	 * 1：阻止虚拟机进行指令重排序
	 * 2：保证共享变量的可见性
	 */
	private static volatile Singleton4 instance;

	/**
	 * 如果在方法上加 synchronized，在其他线程进入方法
	 * 会进行自旋等待锁，这样会消耗cpu资源
	 *
	 * @return 单例对象
	 */
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}

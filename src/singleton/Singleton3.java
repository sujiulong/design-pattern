package singleton;

/**
 * 线程安全懒汉式：
 * 线程安全，懒加载，非反序列化安全
 * 效率很低，99% 情况下不需要同步。
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:02
 */
public class Singleton3 {

	private static Singleton3 instance;

	private Singleton3() {
	}

	/**
	 * 唯一可以访问对象的入口
	 *
	 * @return 单例对象
	 */
	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}

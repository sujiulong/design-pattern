package singleton;

/**
 * 非线程安全懒汉式：(严格意义上不属于单例模式，应该违反单例规则)
 * 线程不安全，懒加载，非反序列化安全
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:02
 */
public class Singleton2 {

	private static Singleton2 instance;

	private Singleton2() {
	}

	/**
	 * 唯一可以访问对象的入口
	 *
	 * @return 单例对象
	 */
	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}

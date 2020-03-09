package singleton;

/**
 * 饿汉式：
 * 线程安全，非懒加载，非反序列化安全（反序列化可重写readResolve方法实现安全）
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:02
 */
public class Singleton1 {
	/**
	 * 创建一个对象
	 */
	private static Singleton1 instance = new Singleton1();

	/**
	 * 构造器私有化，防止用户调用构造器生成对象
	 */
	private Singleton1() {
	}

	/**
	 * 唯一可以访问对象的入口
	 *
	 * @return 单例对象
	 */
	public static Singleton1 getInstance() {
		return instance;
	}
}

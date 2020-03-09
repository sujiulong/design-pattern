package singleton;

/**
 * 枚举单例
 * 最优的单例，线程安全，非懒加载、反序列化安全。
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:17
 */
public enum Singleton5 {
	/**
	 * 单例对象
	 */
	INSTANCE;

	void method() {
		//你的业务代码
	}
}

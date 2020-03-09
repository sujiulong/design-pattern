package singleton;

/**
 * 使用静态内部类实现单例：
 * 线程安全，非懒加载，非反序列化安全
 *
 * @author Su Jiulong
 * @date 2020/3/9 22:17
 */

public class Singleton6 {
	private static class LazyHolder {
		private static final Singleton6 INNER_SINGLETON = new Singleton6();
	}

	private Singleton6() {
	}

	public static Singleton6 getInstance() {
		return LazyHolder.INNER_SINGLETON;
	}
}

package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Su Jiulong
 * @date 2020/3/9 22:24
 */
public class SingletonTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(15);
		for (int i = 0; i < 15; i++) {
			executorService.execute(() -> {
				System.out.println(Singleton1.getInstance() + " === "
						+ Singleton2.getInstance() + " === "
						+ Singleton3.getInstance());
			});
		}

		for (int i = 0; i < 15; i++) {
			executorService.execute(() -> {
				System.out.println(Singleton4.getInstance() + " === "
						+ Singleton5.INSTANCE.hashCode() + " === "
						+ Singleton6.getInstance());
			});
		}
		executorService.shutdown();
	}
}

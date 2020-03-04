package observer.observer1;

import observer.model.StatusDTO;

/**
 * 采用java内建支持的观察者模式
 * Observable: 相当于主题，是一个类，内部使用Vector管理观察者。
 * Observer: 观察者接口
 * 因为Observable是一个类，所以只能使用继承的方式定义主题，即破坏对接口编程的原则。
 *
 * @author Su Jiulong
 * @date 2020/3/4 21:06
 */
public class JavaObserverTest {
	public static void main(String[] args) {
		Broadcaster broadcaster = new Broadcaster();
		DivisionObserver divisionObserver = new DivisionObserver(broadcaster);
		SubtractionObserver subtractionObserver = new SubtractionObserver(broadcaster);

		StatusDTO statusDTO = new StatusDTO(23, 4);
		broadcaster.update(statusDTO, true);

		statusDTO.setNumber1(10);
		broadcaster.update(statusDTO, false);

		divisionObserver.unsubscribe();
		broadcaster.update(statusDTO, true);
	}
}

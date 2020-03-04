package observer;

import observer.model.StatusDTO;
import observer.subject.Broadcaster;

/**
 * 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 * 不变的部分：主题
 * 变化的部分：主题状态、观察者类型及数量
 * 思路：将依赖于主题状态的变化部分抽象出来为观察者，实现解耦。
 *
 * @author Su Jiulong
 * @date 2020/3/4 20:03
 */
public class ObserverTest {
	public static void main(String[] args) {
		Broadcaster broadcaster = new Broadcaster(2);
		AdditionObserver additionObserver = new AdditionObserver(broadcaster);
		MultiplicationObserver multiplicationObserver = new MultiplicationObserver(broadcaster);

		StatusDTO statusDto1 = new StatusDTO(10, 2.5);
		broadcaster.updateStatus(statusDto1);

		statusDto1.setNumber1(14);
		statusDto1.setNumber2(29);
		broadcaster.updateStatus(statusDto1);

		additionObserver.unsubscribe();
		broadcaster.updateStatus(statusDto1);
	}
}

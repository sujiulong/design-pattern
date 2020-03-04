package observer.subject;

import observer.Observer;

/**
 * @author Su Jiulong
 * @date 2020/3/4 18:05
 */
public interface Subject {

	/**
	 * 注册观察者：订阅此主题
	 *
	 * @param observer 具体的观察者对象
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除观察者：取消订阅此主题
	 *
	 * @param observer 具体的观察者对象
	 */
	void removeObserver(Observer observer);

	/**
	 * 通知所有订阅了此主题的观察者，状态已发生改变
	 */
	void notifyObservers();
}

package observer;

import observer.model.StatusDTO;

/**
 * @author Su Jiulong
 * @date 2020/3/4 18:06
 */
public interface Observer {
	/**
	 * 观察者接收消息的方法
	 *
	 * @param status 变化状态的封装
	 */
	void update(StatusDTO status);
}

package observer.subject;

import observer.Observer;
import observer.model.StatusDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Su Jiulong
 * @date 2020/3/4 18:54
 */
public class Broadcaster implements Subject {

	List<Observer> observers = null;

	private StatusDTO statusDTO;

	public Broadcaster() {
	}

	public Broadcaster(int size) {
		observers = new ArrayList<>(size);
	}

	public void updateStatus(StatusDTO statusDTO) {
		this.statusDTO = statusDTO;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		if (hasRepeated(observer)) {
			return;
		}
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		System.out.println(observer.getClass() + " 取消订阅：" + this.getClass());
	}

	@Override
	public void notifyObservers() {
		if (observers.size() == 0) {
			return;
		}
		observers.forEach(observer -> observer.update(statusDTO));
	}

	private boolean hasRepeated(Observer observer) {
		if (observers.indexOf(observer) >= 0) {
			return true;
		}
		return false;
	}
}

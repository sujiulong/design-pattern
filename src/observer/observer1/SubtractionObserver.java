package observer.observer1;

import observer.model.StatusDTO;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Su Jiulong
 * @date 2020/3/4 20:40
 */
public class SubtractionObserver implements Observer {
	private Observable broadcaster;

	public SubtractionObserver() {
	}

	public SubtractionObserver(Observable broadcaster) {
		this.broadcaster = broadcaster;
		broadcaster.addObserver(this);
	}

	public void unsubscribe() {
		broadcaster.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (!(o instanceof Broadcaster)) {
			return;
		}

		StatusDTO statusDTO = null;
		double result = 0L;
		//主题主动push方式
		if (arg != null) {
			statusDTO = (StatusDTO) arg;
			result = statusDTO.getNumber1() - statusDTO.getNumber2();
			System.out.println(this.getClass() + " num1 - num2 = " + result);
			return;
		}

		//订阅者主动pull方式
		Broadcaster broadcaster = (Broadcaster) o;
		statusDTO = broadcaster.getStatusDTO();
		if (statusDTO == null) {
			return;
		}
		result = statusDTO.getNumber1() - statusDTO.getNumber2();
		System.out.println(this.getClass() + " num1 - num2 = " + result);
	}
}

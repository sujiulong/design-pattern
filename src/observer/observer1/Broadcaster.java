package observer.observer1;

import observer.model.StatusDTO;

import java.util.Observable;

/**
 * @author Su Jiulong
 * @date 2020/3/4 20:40
 */
public class Broadcaster extends Observable {

	private StatusDTO statusDTO;

	public void update(StatusDTO statusDTO, boolean isPush) {
		this.statusDTO = statusDTO;
		//主题状态是否更改标志，只有设置为了true，才会通知到订阅者。
		setChanged();
		//通知订阅者,不带参数时，订阅者采用pull方式
		//如果带上参数，则主题主动push方式
		if (isPush) {
			notifyObservers(statusDTO);
			return;
		}
		notifyObservers();
	}

	public StatusDTO getStatusDTO() {
		return statusDTO;
	}
}

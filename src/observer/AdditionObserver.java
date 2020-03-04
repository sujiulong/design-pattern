package observer;

import observer.model.StatusDTO;
import observer.subject.Subject;

/**
 * @author Su Jiulong
 * @date 2020/3/4 20:02
 */
public class AdditionObserver implements Observer {
	private Subject subject;

	public AdditionObserver() {
	}

	public AdditionObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public void unsubscribe() {
		subject.removeObserver(this);
	}

	@Override
	public void update(StatusDTO status) {
		double result = status.getNumber1() + status.getNumber2();
		System.out.println(this.getClass() + ": num1 + num2 = " + result);
	}
}

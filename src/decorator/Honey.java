package decorator;

/**
 * 蜂蜜装饰者
 *
 * @author Su Jiulong
 * @date 2020/3/8 10:58
 */
public class Honey extends CondimentDecorator {
	/**
	 * 被装饰对象
	 */
	private Tea delegate;

	public Honey(Tea tea) {
		this.delegate = tea;
	}

	@Override
	public double cost() {
		return 0.5 + delegate.cost();
	}

	@Override
	public String getDescription() {
		return delegate.getDescription() + "+ honey ";
	}
}

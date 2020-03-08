package decorator;

/**
 * 焦糖装饰者
 *
 * @author Su Jiulong
 * @date 2020/3/8 11:00
 */
public class Caramel extends CondimentDecorator {
	/**
	 * 被装饰对象
	 */
	private Tea delegate;

	public Caramel(Tea tea) {
		this.delegate = tea;
	}

	@Override
	public String getDescription() {
		return delegate.getDescription() + "+ caramel ";
	}

	@Override
	public double cost() {
		return 1 + delegate.cost();
	}
}

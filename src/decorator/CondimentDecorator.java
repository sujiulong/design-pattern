package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/8 10:49
 */
public abstract class CondimentDecorator extends Tea {
	/**
	 * 标记继承此抽象类必须重写此方法
	 *
	 * @return 加入调料后的奶茶描述
	 */
	@Override
	public abstract String getDescription();
}

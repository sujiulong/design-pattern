package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 16:19
 */
public interface CarFactory {
	/**
	 * 工厂方法：子类各自实现自己生产车的方法
	 *
	 * @return 生产的车
	 */
	BaseCar getCar();
}

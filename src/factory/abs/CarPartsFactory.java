package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:04
 */
public interface CarPartsFactory {
	/**
	 * 生产玻璃
	 *
	 * @return 具体玻璃
	 */
	Glass getGlass();

	/**
	 * 生产轮子
	 *
	 * @return 具体轮子
	 */
	Wheel getWheel();
}

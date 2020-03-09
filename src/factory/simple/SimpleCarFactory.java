package factory.simple;

import factory.CarTypeEnum;
import factory.method.BaoMa;
import factory.method.BaseCar;

/**
 * @author Su Jiulong
 * @date 2020/3/9 16:01
 */
public class SimpleCarFactory {
	/**
	 * 简单工厂方法
	 *
	 * @param carType 需要产生的车对应的枚举
	 * @return 需要的车
	 */
	public BaseCar getCar(CarTypeEnum carType) {
		switch (carType) {
			case BAOMA:
				return new BaoMa(CarTypeEnum.BAOMA.getName());
			case BENCHI:
				return new BaoMa(CarTypeEnum.BENCHI.getName());
			default:
				return null;
		}
	}
}

package factory.method;

import factory.CarTypeEnum;

/**
 * @author Su Jiulong
 * @date 2020/3/9 16:21
 */
public class BaoMaFactory implements CarFactory {
	@Override
	public BaseCar getCar() {
		return new BaoMa(CarTypeEnum.BAOMA.getName());
	}
}

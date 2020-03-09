package factory.method;

import factory.CarTypeEnum;

/**
 * @author Su Jiulong
 * @date 2020/3/9 16:24
 */
public class BenChiFactory implements CarFactory {
	@Override
	public BaseCar getCar() {
		return new BenChi(CarTypeEnum.BENCHI.getName());
	}
}

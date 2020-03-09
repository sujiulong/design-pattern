package factory.abs;

import factory.CarTypeEnum;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:30
 */
public class BenChiFactory implements CarFactory {
	@Override
	public BaseCar getCar() {
		CarPartsFactory expensivePartsFactory = new ExpensivePartsFactoryImpl();
		return new BenChi(CarTypeEnum.BENCHI.getName(), expensivePartsFactory);
	}
}

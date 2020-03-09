package factory.abs;

import factory.CarTypeEnum;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:17
 */
public class DaZhongFactory implements CarFactory {
	@Override
	public BaseCar getCar() {
		CarPartsFactory cheapPartsFactory = new CheapPartsFactoryImpl();
		return new DaZhong(CarTypeEnum.DAZHONG.getName(), cheapPartsFactory);
	}
}

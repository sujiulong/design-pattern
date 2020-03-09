package factory.simple;

import factory.CarTypeEnum;
import factory.method.BaseCar;

/**
 * 简单工厂：将生成产品的代码从客户端提取出来，使用单独的类维护，对外提供生产产品的方法。
 * 优点：将生产产品与客户端解耦，使用简单。
 * 缺点：当新增产品时需要更改简单工厂。违法开闭原则
 *
 * @author Su Jiulong
 * @date 2020/3/9 16:09
 */
public class SimpleCarFactoryTest {
	public static void main(String[] args) {
		SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
		BaseCar baoMa = simpleCarFactory.getCar(CarTypeEnum.BAOMA);
		baoMa.run();
		baoMa.stop();

		BaseCar benChi = simpleCarFactory.getCar(CarTypeEnum.BENCHI);
		benChi.run();
		benChi.stop();
	}
}

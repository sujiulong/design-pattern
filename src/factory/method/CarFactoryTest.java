package factory.method;

/**
 * 工厂方法：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 * 优点：符合开闭原则，当新增产品时，只需要新增对应的工厂即可。
 * 缺点：
 * 1、每个工厂只能定制化产生一类产品，比如宝马工厂只能产生宝马系列的车。
 * 2、如果产品很多，将产生很多工厂
 *
 * @author Su Jiulong
 * @date 2020/3/9 16:24
 */
public class CarFactoryTest {
	public static void main(String[] args) {
		BaseCar baoMa = new BaoMaFactory().getCar();
		baoMa.run();
		baoMa.stop();

		BaseCar benChi = new BenChiFactory().getCar();
		benChi.run();
		benChi.stop();
	}
}

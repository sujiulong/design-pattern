package factory.abs;

/**
 * 抽象工厂模式：使用一个大接口，定义了一组产品，子类实现接口并自定义产品的实现。
 * 缺点是当新增产品时，所有子类都需要更改。
 *
 * @author Su Jiulong
 * @date 2020/3/9 17:33
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		DaZhongFactory daZhongFactory = new DaZhongFactory();
		BaseCar daZhong = daZhongFactory.getCar();
		daZhong.run();
		daZhong.stop();

		BenChiFactory benChiFactory = new BenChiFactory();
		BaseCar benChi = benChiFactory.getCar();
		benChi.run();
		benChi.stop();
	}
}

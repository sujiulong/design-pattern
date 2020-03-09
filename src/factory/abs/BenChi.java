package factory.abs;

/**
 * @author Su Jiulong
 * @date 2020/3/9 17:29
 */
public class BenChi extends BaseCar {
	private CarPartsFactory carPartsFactory;

	public BenChi(String name, CarPartsFactory carPartsFactory) {
		this.name = name;
		this.carPartsFactory = carPartsFactory;
	}

	@Override
	void prepare() {
		String parts = name + "正在组装"
				+ carPartsFactory.getGlass() + ","
				+ carPartsFactory.getWheel();
		System.out.println(parts);
	}
}

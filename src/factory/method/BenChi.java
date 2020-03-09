package factory.method;

/**
 * @author Su Jiulong
 * @date 2020/3/9 15:59
 */
public class BenChi extends BaseCar {
	public BenChi(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + "车正在运行");
	}

	@Override
	public void stop() {
		System.out.println(this.name + "车已经停止运行");
	}
}

package facade.kitchen;

/**
 * 灶台
 *
 * @author Su Jiulong
 * @date 2020/3/11 13:35
 */
public class Hearth {
	public void on() {
		System.out.println("灶台已经打开");
	}

	public void softFire() {
		System.out.println("已调至文火");
	}

	public void bigFire() {
		System.out.println("已调至猛火");
	}

	public void off() {
		System.out.println("灶台已经关闭");
	}
}

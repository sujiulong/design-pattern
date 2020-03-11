package adapter;

/**
 * @author Su Jiulong
 * @date 2020/3/11 10:19
 */
public class AcCharger implements Alternating {
	@Override
	public void charge() {
		System.out.println("正在使用交流充电中");
	}
}

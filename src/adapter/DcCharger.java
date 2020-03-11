package adapter;

/**
 * @author Su Jiulong
 * @date 2020/3/11 10:18
 */
public class DcCharger implements Cocurrent {
	@Override
	public void charge() {
		System.out.println("正在使用直流充电中");
	}
}

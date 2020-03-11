package adapter;

/**
 * 目标接口：Alternating
 * 被适配者：DcCharger
 * 适配器：将直流适配为交流
 *
 * @author Su Jiulong
 * @date 2020/3/11 10:21
 */
public class CocurrentAdapterTest {
	public static void main(String[] args) {
		Cocurrent dcCharger = new DcCharger();
		//将直流冒充交流用
		Alternating cocurrentAdapter = new CocurrentAdapter(dcCharger);
		cocurrentAdapter.charge();
	}
}

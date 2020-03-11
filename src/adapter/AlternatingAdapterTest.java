package adapter;

/**
 * 适配器模式：将一个类的接口，转换为客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 * 装饰者模式：主要在于动态增加职责
 * 适配器模式：主要用于将接口适配
 * <p>
 * 目标接口：Cocurrent
 * 被适配者：AcCharger
 * 适配器：将交流适配为直流
 *
 * @author Su Jiulong
 * @date 2020/3/11 10:35
 */
public class AlternatingAdapterTest {
	public static void main(String[] args) {
		Alternating alternating = new AcCharger();
		//交流冒充直流使用
		Cocurrent alternatingAdapter = new AlternatingAdapter(alternating);
		alternatingAdapter.charge();
	}
}

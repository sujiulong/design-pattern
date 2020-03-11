package facade.kitchen;

/**
 * 外观模式：提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
 * 优点：将客户从一个复杂的子系统中解耦。只依赖外观，不依赖子系统。
 * 最少知识原则：不要过多依赖
 * 就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法
 * 1、该对象的方法
 * 2、被当作方法的参数而传递进来的对象
 * 3、此方法所创建或实例化的任何对象
 * 4、对象组合的组件
 *
 * @author Su Jiulong
 * @date 2020/3/11 15:09
 */
public class KitchenFacadeTest {
	public static void main(String[] args) {
		Hearth hearth = new Hearth();
		KitchenVentilator kitchenVentilator = new KitchenVentilator();
		Wok wok = new Wok();

		//使用
		KitchenFacade kitchenFacade = new KitchenFacade(hearth, kitchenVentilator, wok);
		kitchenFacade.cooking();
	}
}

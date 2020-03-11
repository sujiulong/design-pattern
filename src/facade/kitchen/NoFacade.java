package facade.kitchen;

/**
 * 如果不使用外观模式，我们的客户端会直接依赖很多组件。
 * 做一件事需要调用多个组件的方法完成。
 *
 * @author Su Jiulong
 * @date 2020/3/11 13:42
 */
public class NoFacade {
	public static void main(String[] args) {
		Hearth hearth = new Hearth();
		KitchenVentilator kitchenVentilator = new KitchenVentilator();
		Wok wok = new Wok();

		//开始做菜
		kitchenVentilator.on();
		hearth.on();
		wok.cooking();
		wok.toDish();
		hearth.off();
		kitchenVentilator.off();
	}
}

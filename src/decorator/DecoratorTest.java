package decorator;

/**
 * 装饰者模式：动态透明地给对象增加职责。
 * 特点：
 * 1、装饰者与被装饰者有相同的超类型
 * 2、可以用一个或多个装饰者包装一个对象
 * 3、装饰者可以在被装饰对象之前或之后，加上自己的行为，以达到特定的目的。
 *
 * @author Su Jiulong
 * @date 2020/3/8 11:01
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Tea pearlMilkTea = new PearlMilkTea(CapacityEnum.SMALL);
		System.out.println(pearlMilkTea.getDescription() + " " + pearlMilkTea.cost());

		pearlMilkTea = new Caramel(new Honey(pearlMilkTea));
		System.out.println(pearlMilkTea.getDescription() + " " + pearlMilkTea.cost());

		Tea redTea = new Honey(new RedTea(CapacityEnum.TALL));
		System.out.println(redTea.getDescription() + " " + redTea.cost());

		//黑暗料理
		Tea greenTea = new Caramel(new Honey(new GreenTea(CapacityEnum.GRANDE)));
		System.out.println(greenTea.getDescription() + " " + greenTea.cost());
	}
}

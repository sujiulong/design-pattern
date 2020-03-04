package strategy.weapon;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:13
 */
public class BowAndArrowBehaviorImpl implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用弓箭射击");
	}
}

package strategy.weapon;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:16
 */
public class SwordBehaviorImpl implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用宝剑挥舞");
	}
}

package strategy.weapon;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:14
 */
public class AxeBehaviorImpl implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用斧头砍劈");
	}
}

package strategy.weapon;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:11
 */
public class KnifeBehaviorImpl implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用匕首刺杀");
	}
}

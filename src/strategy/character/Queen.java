package strategy.character;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:18
 */
public class Queen extends BaseCharacter {
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}

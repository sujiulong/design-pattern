package strategy.character;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:22
 */
public class Knight extends BaseCharacter {
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}

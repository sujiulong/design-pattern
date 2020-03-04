package strategy.character;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:20
 */
public class King extends BaseCharacter {
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}

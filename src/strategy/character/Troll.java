package strategy.character;

/**
 * @author Su Jiulong
 * @date 2020/3/4 11:34
 */
public class Troll extends BaseCharacter {
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}

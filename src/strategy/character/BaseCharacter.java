package strategy.character;

import strategy.weapon.WeaponBehavior;

/**
 * 角色基类
 *
 * @author Su Jiulong
 * @date 2020/3/4 11:07
 */
public abstract class BaseCharacter {
	/**
	 * 武器接口
	 */
	protected WeaponBehavior weaponBehavior;

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	/**
	 * 战斗的方法
	 */
	public abstract void fight();
}

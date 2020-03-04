package strategy;

import strategy.character.BaseCharacter;
import strategy.character.Queen;
import strategy.character.Troll;
import strategy.weapon.AxeBehaviorImpl;
import strategy.weapon.BowAndArrowBehaviorImpl;
import strategy.weapon.KnifeBehaviorImpl;

/**
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 * <p>
 * 例子原型为：游戏角色类和具体角色，以及可以使用的武器行为的类。
 * 每个角色一次只能使用一种武器但可以在游戏中更换武器。
 * 每个角色都可以使用武器战斗（不变的部分）
 * 每个角色使用的武器不一样（变化的部分）
 *
 * @author Su Jiulong
 * @date 2020/3/4 11:23
 */
public class StrategyTest {
	public static void main(String[] args) {
		BaseCharacter queen = new Queen();
		queen.setWeaponBehavior(new BowAndArrowBehaviorImpl());

		queen.fight();
		queen.setWeaponBehavior(new KnifeBehaviorImpl());
		//战斗中更换武器
		queen.fight();

		System.out.println("------------------------------");
		BaseCharacter troll = new Troll();
		troll.setWeaponBehavior(new AxeBehaviorImpl());
		troll.fight();
	}
}

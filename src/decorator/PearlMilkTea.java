package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/8 10:46
 */
public class PearlMilkTea extends BaseTea {
	public PearlMilkTea(CapacityEnum capacityEnum) {
		this.capacityEnum = capacityEnum;
	}

	@Override
	public String getDescription() {
		return capacityEnum.getCapacity() + " pearl milk tea ";
	}

	@Override
	public double cost() {
		return 2 + capacityEnum.getPrice();
	}
}

package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/8 10:41
 */
public class GreenTea extends BaseTea {
	public GreenTea(CapacityEnum capacityEnum) {
		this.capacityEnum = capacityEnum;
	}

	@Override
	public String getDescription() {
		return capacityEnum.getCapacity() + " green tea ";
	}

	@Override
	public double cost() {
		return 1 + capacityEnum.getPrice();
	}
}

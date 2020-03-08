package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/7 22:13
 */
public class RedTea extends Tea {

	public RedTea(CapacityEnum capacityEnum) {
		this.capacityEnum = capacityEnum;
	}

	@Override
	public String getDescription() {
		return capacityEnum.getCapacity() + " red tea ";
	}

	@Override
	public double cost() {
		return 1.5 + capacityEnum.getPrice();
	}
}

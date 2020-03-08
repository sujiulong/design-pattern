package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/7 22:01
 */
public abstract class Tea {
	/**
	 * 描述
	 */
	String description = "UNKNOW";
	/**
	 * 小中大杯枚举
	 */
	CapacityEnum capacityEnum;

	public CapacityEnum getCapacityEnum() {
		return capacityEnum;
	}

	public void setCapacityEnum(CapacityEnum capacityEnum) {
		this.capacityEnum = capacityEnum;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 计算茶价格
	 *
	 * @return 金额
	 */
	public abstract double cost();
}

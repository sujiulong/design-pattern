package decorator;

/**
 * @author Su Jiulong
 * @date 2020/3/7 22:04
 */
public enum CapacityEnum {

	/**
	 * 小杯
	 */
	SMALL("小杯", 6),
	/**
	 * 中杯
	 */
	TALL("中杯", 7),
	/**
	 * 大杯
	 */
	GRANDE("大杯", 8);

	/**
	 * 容量
	 */
	private String capacity;
	/**
	 * 价格
	 */
	private double price;

	CapacityEnum(String capacity, double price) {
		this.capacity = capacity;
		this.price = price;
	}

	public String getCapacity() {
		return capacity;
	}

	public double getPrice() {
		return price;
	}
}

package factory;

/**
 * @author Su Jiulong
 * @date 2020/3/9 16:01
 */
public enum CarTypeEnum {
	/**
	 * 宝马车
	 */
	BAOMA("宝马"),
	/**
	 * 奔驰车
	 */
	BENCHI("奔驰"),
	/**
	 * 大众车
	 */
	DAZHONG("大众");

	/**
	 * 车名
	 */
	private String name;

	public String getName() {
		return name;
	}

	CarTypeEnum(String name) {
		this.name = name;
	}
}

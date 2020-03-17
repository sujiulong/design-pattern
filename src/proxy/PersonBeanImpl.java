package proxy;

/**
 * @author Su Jiulong
 * @date 2020/3/17 9:49
 */
public class PersonBeanImpl implements PersonBean {
	private String name;
	private int age;
	private int height;
	private int score;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public int getScore() {
		return this.score;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "PersonBeanImpl{" +
				"name='" + name + '\'' +
				", age=" + age +
				", height=" + height +
				", score=" + score +
				'}';
	}
}

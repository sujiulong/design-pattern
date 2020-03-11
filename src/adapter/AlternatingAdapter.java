package adapter;

/**
 * @author Su Jiulong
 * @date 2020/3/11 10:34
 */
public class AlternatingAdapter implements Cocurrent {
	private Alternating alternating;

	AlternatingAdapter(Alternating alternating) {
		this.alternating = alternating;
	}

	@Override
	public void charge() {
		this.alternating.charge();
	}
}

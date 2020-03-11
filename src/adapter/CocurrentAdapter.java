package adapter;

/**
 * 交流适配器
 *
 * @author Su Jiulong
 * @date 2020/3/11 10:20
 */
public class CocurrentAdapter implements Alternating {
	private Cocurrent cocurrent;

	public CocurrentAdapter(Cocurrent cocurrent) {
		this.cocurrent = cocurrent;
	}

	@Override
	public void charge() {
		this.cocurrent.charge();
	}
}

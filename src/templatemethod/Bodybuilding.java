package templatemethod;

/**
 * @author Su Jiulong
 * @date 2020/3/11 22:08
 */
public class Bodybuilding extends BaseFitness {
	@Override
	void warmUp() {
		System.out.println("跑步热身");
	}

	@Override
	void exercise() {
		System.out.println("进行哑铃、动力单车、臂力等训练");
	}

	@Override
	void bath() {
		System.out.println("进行淋浴，洗去汗渍");
	}
}

package templatemethod;

/**
 * @author Su Jiulong
 * @date 2020/3/11 22:06
 */
public class Swimmer extends BaseFitness {
	@Override
	void warmUp() {
		System.out.println("热身运动是拉伸手脚，避免抽经");
	}

	@Override
	void exercise() {
		System.out.println("进行蛙泳、蝶泳、自由泳等");
	}
}

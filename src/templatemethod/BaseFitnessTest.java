package templatemethod;

/**
 * @author Su Jiulong
 * @date 2020/3/11 22:10
 */
public class BaseFitnessTest {
	public static void main(String[] args) {
		Bodybuilding bodybuilding = new Bodybuilding();
		bodybuilding.fitness();

		System.out.println("---------------------------");
		Swimmer swimmer = new Swimmer();
		swimmer.fitness();
	}
}

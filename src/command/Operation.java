package command;

/**
 * @author Su Jiulong
 * @date 2020/3/10 21:10
 */
public class Operation {
	private double num1;
	private double num2;

	public Operation(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double add() {
		double result = this.num1 + this.num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		return result;
	}

	public double sub() {
		double result = this.num1 - this.num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		return result;
	}

	public double multiplication() {
		double result = this.num1 * this.num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		return result;
	}

	public double divide() {
		double result = this.num1 / this.num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		return result;
	}
}

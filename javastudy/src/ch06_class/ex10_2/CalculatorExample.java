package ch06_class.ex10_2;

public class CalculatorExample {

	public static void main(String[] args) {
		double result = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		
		System.out.println(result);
		System.out.println(result2);
	}

}

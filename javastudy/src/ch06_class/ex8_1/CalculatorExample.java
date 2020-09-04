package ch06_class.ex8_1;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator mc = new Calculator();
		
		mc.powerOn();
		
		int result1 = mc.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = mc.divide(x, y);
		System.out.println("result2 = " + result2);
		
		mc.powerOff();
	}

}

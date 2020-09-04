package ch06_class.ex8_4;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator mc = new Calculator();
		
		System.out.println("정사각형 넓이 = " + mc.areaRectangle(10));
		System.out.println("정사각형 넓이 = " + mc.areaRectangle(10, 12));
	}

}

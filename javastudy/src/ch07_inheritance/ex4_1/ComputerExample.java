package ch07_inheritance.ex4_1;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer cpu = new Computer();
		System.out.println("������ : " + cpu.areaCircle(r));
	}

}

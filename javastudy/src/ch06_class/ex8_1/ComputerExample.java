package ch06_class.ex8_1;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		System.out.println(com.sum(1, 2, 3, 4, 5));
		
		int[] values1 = {1, 2, 3, 4, 5};
		System.out.println(com.sum(values1));
		
		System.out.println(com.sum(new int[] {1, 2, 3, 4, 5}));
		
	}

}

package ch14_lambda.ex5_2;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		IntSupplier sup = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = sup.getAsInt();
		
		System.out.println("´«ÀÇ ¼ö : " + num);
	}

}

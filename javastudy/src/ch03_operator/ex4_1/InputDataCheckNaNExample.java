package ch03_operator.ex4_1;

import java.util.Scanner;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("입력된 값이 숫자가 아닙니다.");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}

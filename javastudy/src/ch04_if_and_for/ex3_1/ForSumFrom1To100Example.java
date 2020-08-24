package ch04_if_and_for.ex3_1;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(;i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + (i - 1) + "까지의 합은 : " + sum);
	}

}

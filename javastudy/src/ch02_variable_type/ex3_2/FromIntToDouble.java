package ch02_variable_type.ex3_2;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// float num3 = num2 로 식을 작성하면 결과가 원하는대로 도출 되지 않음. 이는 float과 double의 정밀도 문제때문임.
		// int -> 실수형으로 변환 시 double로 변환하면 정밀도 손실 문제가 해결된다.
		double num3 = num2;
		num2 = (int) num3;
		
		System.out.println(num1 - num2);
	}

}

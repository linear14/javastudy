package ch02_variable_type.ex3_1;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '°¡';
		int intValue2 = charValue;
		double doubleValue = charValue;
		System.out.println(intValue2);
		System.out.println(doubleValue);
		
	}

}

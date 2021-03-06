package ch02_variable_type.ex3_3;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'a';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; // 연산 결과가 int형이 되기 때문에 컴파일에러
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		System.out.println((char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = intValue5 / 4.0;  // 연산 결과가 double 이기 때문에 int 변수에 담을 수 없음
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}

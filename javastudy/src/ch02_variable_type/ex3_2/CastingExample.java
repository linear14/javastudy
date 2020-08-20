package ch02_variable_type.ex3_2;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 52222;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		int intValue2 = (int)longValue;
		System.out.println(intValue2);
		
		double dValue = 3.14;
		long lValue = (long)dValue;
		System.out.println(lValue);
	}

}

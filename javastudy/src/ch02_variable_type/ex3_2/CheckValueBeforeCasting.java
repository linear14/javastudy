package ch02_variable_type.ex3_2;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("int -> byte 변환할 수 없습니다.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}

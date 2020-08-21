package ch03_operator.ex4_3;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이동현";
		String strVar2 = "이동현";
		String strVar3 = new String("이동현");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}

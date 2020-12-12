package ch13_generic.ex5;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.<Double>compare(3.0, 2.5);
		System.out.println(result2);
		
		int result3 = Util.compare(2, 2.0);
		System.out.println(result3);

	}

}

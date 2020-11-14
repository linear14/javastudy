package ch11_apis.ex6_1;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println(clazz1.getTypeName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("ch11_apis.ex6_1.Car");
			
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println(clazz2.getTypeName());
		} catch(Exception e) {}

	}

}

class Car {}

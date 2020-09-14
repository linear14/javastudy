package ch07_inheritance.ex7_6;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		method1(parent);
		method2(parent);
		
		Parent parent2 = new Parent();
		method1(parent2);
		// method2(new Parent());
	}

}

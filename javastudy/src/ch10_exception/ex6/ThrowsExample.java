package ch10_exception.ex6;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String2");
	}

}

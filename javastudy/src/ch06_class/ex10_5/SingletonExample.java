package ch06_class.ex10_5;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� singleton ��ü�Դϴ�.");
		}
	}

}

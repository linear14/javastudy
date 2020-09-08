package ch06_class.ex10_4;

/***
 * static method Ȥ�� field ������ �ν��Ͻ��� ����� ���� ����� �����ϱ� ������,
 * �� ���� ��Ͽ� �ν��Ͻ� variable Ȥ�� method�� ����� �� �����ϴ�.
 * ���� ����ϴ� public static void main()�� ��쵵 static �����̹Ƿ�,
 * �� ���ο� Ŭ�������� ���� �ν��Ͻ� ������ ���� ������ �Ұ����մϴ�.
 * 
 * �Ʒ��� ���ε��, speed field ���� main �Լ����� �ٷ� ������� ���ϸ�
 * Car�� ��ü�� ������־� �����ϴ� ������� ��� �����մϴ�.
 */
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}

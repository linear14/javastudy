package ch07_inheritance.ex8_3;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("����");
		
		SmartPhone sphone = new SmartPhone("����");
		sphone.turnOn();
		sphone.internetSearch();
		sphone.turnOff();
		System.out.println("===============");
		
		Phone phone = new SmartPhone("�Ƹ�");
		phone.turnOn();
		// phone.internetSearch();
		phone.turnOff();
	}

}

package ch07_inheritance.ex8_3;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("동현");
		
		SmartPhone sphone = new SmartPhone("동현");
		sphone.turnOn();
		sphone.internetSearch();
		sphone.turnOff();
		System.out.println("===============");
		
		Phone phone = new SmartPhone("아름");
		phone.turnOn();
		// phone.internetSearch();
		phone.turnOff();
	}

}

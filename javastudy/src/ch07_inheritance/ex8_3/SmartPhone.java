package ch07_inheritance.ex8_3;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}

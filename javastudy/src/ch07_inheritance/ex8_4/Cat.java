package ch07_inheritance.ex8_4;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}

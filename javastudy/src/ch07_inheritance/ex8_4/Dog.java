package ch07_inheritance.ex8_4;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

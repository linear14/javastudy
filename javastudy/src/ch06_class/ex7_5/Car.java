package ch06_class.ex7_5;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this(model, "����", 100);
	}
	
	Car(String model, String color) {
		this(model, color, 100);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

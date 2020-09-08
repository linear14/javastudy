package ch06_class.ex10_4;

/***
 * static method 혹은 field 값들은 인스턴스가 생기기 전에 사용이 가능하기 때문에,
 * 그 내부 블록에 인스턴스 variable 혹은 method를 사용할 수 없습니다.
 * 흔히 사용하는 public static void main()의 경우도 static 형태이므로,
 * 그 내부에 클래스에서 만든 인스턴스 변수에 대한 참조가 불가능합니다.
 * 
 * 아래를 예로들어, speed field 값은 main 함수에서 바로 사용하지 못하며
 * Car의 객체를 만들어주어 참조하는 방식으로 사용 가능합니다.
 */
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}

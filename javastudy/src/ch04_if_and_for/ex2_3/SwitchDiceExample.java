package ch04_if_and_for.ex2_3;

public class SwitchDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		case 1 : 
			System.out.println("주사위 숫자 1이 나왔습니다.");
			break;
		case 2 : 
			System.out.println("주사위 숫자 2이 나왔습니다.");
			break;
		case 3 : 
			System.out.println("주사위 숫자 3이 나왔습니다.");
			break;
		case 4 : 
			System.out.println("주사위 숫자 4이 나왔습니다.");
			break;
		case 5 : 
			System.out.println("주사위 숫자 5이 나왔습니다.");
			break;
		default : 
			System.out.println("주사위 숫자 6이 나왔습니다.");
			break;
		}
	}

}

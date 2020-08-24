package ch04_if_and_for.ex2_5;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String position = sc.next();
		
		switch(position) {
			case "부장" : 
				System.out.println("부장님 월급은 700만원 입니다.");
				break;
			case "과장" :
				System.out.println("과장님 월급은 500만원 입니다.");
				break;
			default :
				System.out.println("사원의 월급은 300만원 입니다.");
		}
	}

}

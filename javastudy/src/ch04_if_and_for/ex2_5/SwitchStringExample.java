package ch04_if_and_for.ex2_5;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String position = sc.next();
		
		switch(position) {
			case "����" : 
				System.out.println("����� ������ 700���� �Դϴ�.");
				break;
			case "����" :
				System.out.println("����� ������ 500���� �Դϴ�.");
				break;
			default :
				System.out.println("����� ������ 300���� �Դϴ�.");
		}
	}

}

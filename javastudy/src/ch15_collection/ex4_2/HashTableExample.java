package ch15_collection.ex4_2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "122");
		map.put("summer", "123");
		map.put("fall", "124");
		map.put("winter", "125");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			String pwd = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			System.out.println();
		}
		
	}

}

package ch03_operator.ex3_1;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		int result3 = x;
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		short s = 100;
		// short wrong = +s;  ��ȣ �������� ���� Ÿ���� int Ÿ���� �ǹǷ�, ������ ����.
		int result4 = -s;
		System.out.println(result4);
	}

}

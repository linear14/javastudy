package ch02_variable_type.ex3_2;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		// float num3 = num2 �� ���� �ۼ��ϸ� ����� ���ϴ´�� ���� ���� ����. �̴� float�� double�� ���е� ����������.
		// int -> �Ǽ������� ��ȯ �� double�� ��ȯ�ϸ� ���е� �ս� ������ �ذ�ȴ�.
		double num3 = num2;
		num2 = (int) num3;
		
		System.out.println(num1 - num2);
	}

}
package ch09_nested_objects.ex3_3;

public class Outter {
	public void method(int arg, final int arg2) {
		int localVariable = 1;
		final int localVariable2 = 3;
		
		class Inner {
			int same = localVariable2;
			public void method() {
				int result = arg + localVariable;	
			}
		}
	}
}

// final�� ���� �Ű����� �� ���������� ���� ���� Ŭ������ �޼��� ���ο� ����
// ���� ���� �Ű����� �� ���������� ���� Ŭ������ �ʵ�� ����

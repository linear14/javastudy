package ch14_lambda.ex4_2;

public class UsingLocalVariable {
	
	void method(int arg) {
		int localVar = 40;
		// localVar = 50;  // �ּ� Ǯ�� ���ٽĿ��� ������� ���� (final Ư���� Ǯ������)
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
			System.out.println();
		};
		
		fi.method();
	}
}

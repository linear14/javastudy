package ch14_lambda.ex4_2;

public class UsingLocalVariable {
	
	void method(int arg) {
		int localVar = 40;
		// localVar = 50;  // 주석 풀면 람다식에서 사용하지 못함 (final 특성이 풀려버림)
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
			System.out.println();
		};
		
		fi.method();
	}
}

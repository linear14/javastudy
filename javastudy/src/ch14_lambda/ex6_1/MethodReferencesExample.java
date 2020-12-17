package ch14_lambda.ex6_1;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		int result;
		
		// 정적 메소드
		operator = Calculator::staticMethod;
		result = operator.applyAsInt(3, 4);
		System.out.println(result);
		
		
		// 인스턴스 메소드
		Calculator cal = new Calculator();
		operator = cal::instanceMethod;
		result = operator.applyAsInt(3, 4);
		System.out.println(result);
	}

}

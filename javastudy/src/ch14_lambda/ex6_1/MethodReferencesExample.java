package ch14_lambda.ex6_1;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		int result;
		
		// ���� �޼ҵ�
		operator = Calculator::staticMethod;
		result = operator.applyAsInt(3, 4);
		System.out.println(result);
		
		
		// �ν��Ͻ� �޼ҵ�
		Calculator cal = new Calculator();
		operator = cal::instanceMethod;
		result = operator.applyAsInt(3, 4);
		System.out.println(result);
	}

}

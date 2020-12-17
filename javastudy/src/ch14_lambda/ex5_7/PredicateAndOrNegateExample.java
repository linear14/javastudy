package ch14_lambda.ex5_7;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		
		// 2�� ��� �˻�
		IntPredicate predicate2 = a -> a%2 == 0;
		
		// 3�� ��� �˻�
		IntPredicate predicate3 = a -> a%3 == 0;
		
		IntPredicate predicateCombine;
		boolean result;
		
		
		// and()
		predicateCombine = predicate2.and(predicate3);
		result = predicateCombine.test(9);
		System.out.println("9�� 2�� ����̸鼭 3�� ����Դϱ�? : " + result);
		
		// or()
		predicateCombine = predicate2.or(predicate3);
		result = predicateCombine.test(9);
		System.out.println("9�� 2�� ����̰ų� 3�� ����Դϱ�? : " + result);
		
		// negate()
		predicateCombine = predicate2.negate();
		result = predicateCombine.test(9);
		System.out.println("9�� Ȧ���Դϱ�? : " + result);

	}

}

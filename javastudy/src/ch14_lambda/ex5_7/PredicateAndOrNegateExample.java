package ch14_lambda.ex5_7;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		
		// 2의 배수 검사
		IntPredicate predicate2 = a -> a%2 == 0;
		
		// 3의 배수 검사
		IntPredicate predicate3 = a -> a%3 == 0;
		
		IntPredicate predicateCombine;
		boolean result;
		
		
		// and()
		predicateCombine = predicate2.and(predicate3);
		result = predicateCombine.test(9);
		System.out.println("9는 2의 배수이면서 3의 배수입니까? : " + result);
		
		// or()
		predicateCombine = predicate2.or(predicate3);
		result = predicateCombine.test(9);
		System.out.println("9는 2의 배수이거나 3의 배수입니까? : " + result);
		
		// negate()
		predicateCombine = predicate2.negate();
		result = predicateCombine.test(9);
		System.out.println("9는 홀수입니까? : " + result);

	}

}

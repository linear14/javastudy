package ch14_lambda.ex6_3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		
		// String을 매개변수로, Member를 리턴값으로
		Function<String, Member> function1 = Member::new;
		BiFunction<String, String, Member> function2 = Member::new;
		
		Member member1 = function1.apply("동현");
		Member member2 = function2.apply("동현", "lee");

	}

}

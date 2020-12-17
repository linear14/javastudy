package ch14_lambda.ex6_3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		
		// String�� �Ű�������, Member�� ���ϰ�����
		Function<String, Member> function1 = Member::new;
		BiFunction<String, String, Member> function2 = Member::new;
		
		Member member1 = function1.apply("����");
		Member member2 = function2.apply("����", "lee");

	}

}

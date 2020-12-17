package ch14_lambda.ex5_6;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		
		Consumer<Member> consumerA = (member) -> {
			System.out.println("consumerA: " + member.getName());
		};
		
		Consumer<Member> consumerB = (member) -> {
			System.out.println("consumerB: " + member.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", null));

	}

}

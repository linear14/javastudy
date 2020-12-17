package ch14_lambda.ex5_6;

import java.util.function.Function;

public class FunctionAndThenExample {

	public static void main(String[] args) {
		
		Function<Member, Address> funA;
		Function<Address, String> funB;
		Function<Member, String> funAB;
		String city;
		
		funA = (member) -> {
			return member.getAddress();
		};
		
		funB = (add) -> {
			return add.getCity();
		};
		
		funAB = funA.andThen(funB);
		
		city = funAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		
		System.out.println("거주 도시 : " + city);
		
		
		
		

	}

}

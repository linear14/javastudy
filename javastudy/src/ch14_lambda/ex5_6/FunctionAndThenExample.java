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
		
		city = funAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		
		System.out.println("���� ���� : " + city);
		
		
		
		

	}

}

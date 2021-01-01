package ch16_stream.ex7;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println("[peek를 마지막에 호출하면 동작되지 않는다.]");
		
		Arrays.stream(intArray)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n));
		
		System.out.println("[최종 처리 메소드를 마지막에 호출 할 경우]");
		
		int total = Arrays.stream(intArray)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n))
			.sum();
		
		System.out.println("총합 : " + total);
		
		
		System.out.println("[forEach를 마지막에 호출하는 경우]");
		
		Arrays.stream(intArray)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));

	}

}

package ch16_stream.ex7;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println("[peek�� �������� ȣ���ϸ� ���۵��� �ʴ´�.]");
		
		Arrays.stream(intArray)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n));
		
		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ�� �� ���]");
		
		int total = Arrays.stream(intArray)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n))
			.sum();
		
		System.out.println("���� : " + total);
		
		
		System.out.println("[forEach�� �������� ȣ���ϴ� ���]");
		
		Arrays.stream(intArray)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));

	}

}

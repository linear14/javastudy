package ch16_stream.ex4;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "이동현", "신용권", "김자바", "신용권", "황재연");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		names.parallelStream()
		.filter(n -> n.startsWith("이"))
		.forEach(n -> System.out.println(n));
		
		System.out.println();

	}

}

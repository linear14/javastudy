package ch16_stream.ex4;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ȫ�浿", "�̵���", "�ſ��", "���ڹ�", "�ſ��", "Ȳ�翬");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		names.parallelStream()
		.filter(n -> n.startsWith("��"))
		.forEach(n -> System.out.println(n));
		
		System.out.println();

	}

}

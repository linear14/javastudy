package ch16_stream.ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		
		IntStream intStream = Arrays.stream(new int[] {1, 2, 3, 4, 5} );
		
		intStream
		.sorted()
		.forEach(num -> System.out.println(num));
		
		
		List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 30),
			new Student("�̵���", 10),
			new Student("���߻�", 40)
		);
		
		System.out.println();
		
		list.stream()
		.sorted()
		.forEach(stu -> System.out.println(stu.getScore()));
		
		System.out.println();
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(stu -> System.out.println(stu.getScore()));

	}

}

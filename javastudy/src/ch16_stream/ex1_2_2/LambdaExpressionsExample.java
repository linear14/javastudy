package ch16_stream.ex1_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			new Student("이동현", 90),
			new Student("이보람", 90),
			new Student("정해인", 40)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " _ " + score);
		});

	}

}

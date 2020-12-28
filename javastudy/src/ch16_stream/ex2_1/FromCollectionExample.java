package ch16_stream.ex2_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import ch16_stream.ex1_2_2.Student;

public class FromCollectionExample {

	public static void main(String[] args) {
		
		List<Student> student = Arrays.asList(
				new Student("홍길동", 10),
				new Student("이동현", 30)
			);
		
		Stream<Student> stream = student.stream();
		stream.forEach(s -> System.out.println(s.getName()));

	}

}

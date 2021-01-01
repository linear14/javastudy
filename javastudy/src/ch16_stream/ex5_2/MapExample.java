package ch16_stream.ex5_2;

import java.util.Arrays;
import java.util.List;

import ch16_stream.ex1_2_2.Student;

public class MapExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("이동현", 20),
			new Student("이보람", 25)			
		);
		
		studentList.stream()
		.mapToInt(Student::getScore)
		.forEach(score -> System.out.println(score));

	}

}

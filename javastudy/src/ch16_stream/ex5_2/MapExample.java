package ch16_stream.ex5_2;

import java.util.Arrays;
import java.util.List;

import ch16_stream.ex1_2_2.Student;

public class MapExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("�̵���", 20),
			new Student("�̺���", 25)			
		);
		
		studentList.stream()
		.mapToInt(Student::getScore)
		.forEach(score -> System.out.println(score));

	}

}

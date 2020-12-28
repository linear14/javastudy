package ch16_stream.ex1_2_4;

import java.util.Arrays;
import java.util.List;

import ch16_stream.ex1_2_2.Student;

public class MapAndReduceExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("�̵���", 100),
				new Student("���ڹ�", 70),
				new Student("�赿��", 80)
			);

		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		System.out.println(avg);

	}

}

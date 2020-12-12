package ch13_generic.ex6;

import java.util.Arrays;

public class WildCardExample {

	// ��� Ÿ���� ������ ��� ����
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		System.out.println("\n");
		
		// ---------------------------------------------------------
		
		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		registerWorkerCourse(workerCourse);
		System.out.println("\n");
		
		// ---------------------------------------------------------
		
		Course<Student> studentCourse = new Course<>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));

		registerStudentCourse(studentCourse);
	}

}

package ch07_inheritance.ex3;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "951234-1234567", 100);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);

	}

}

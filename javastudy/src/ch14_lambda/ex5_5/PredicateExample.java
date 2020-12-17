package ch14_lambda.ex5_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿", "����", 90),
		new Student("�����", "����", 85),
		new Student("�̵���", "����", 100),
		new Student("���ѳ�", "����", 95)
	);
	
	public static double avgOfSex( Predicate<Student> predicate ) {
		int count = 0;
		int sum = 0;
		
		for(Student student: list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		
		double maleAvg = avgOfSex(
			(stu) -> {
				return stu.getSex().equals("����");
			}
		);
		System.out.println("���� ���� ��� : " + maleAvg);
		
		double femaleAvg = avgOfSex( stu -> stu.getSex().equals("����") );
		System.out.println("���� ���� ��� : " + femaleAvg);

	}

}

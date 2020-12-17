package ch14_lambda.ex5_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", "남자", 90),
		new Student("김순희", "여자", 85),
		new Student("이동현", "남자", 100),
		new Student("박한나", "여자", 95)
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
				return stu.getSex().equals("남자");
			}
		);
		System.out.println("남자 성적 평균 : " + maleAvg);
		
		double femaleAvg = avgOfSex( stu -> stu.getSex().equals("여자") );
		System.out.println("여자 성적 평균 : " + femaleAvg);

	}

}

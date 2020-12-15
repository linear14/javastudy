package ch14_lambda.ex5_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 95),
			new Student("�̵���", 100, 100)
	);
	
	public static double avg( ToIntFunction<Student> function ) {
		int sum = 0;
		for(Student student: list) {
			sum += function.applyAsInt(student);
		}
		double average = (double) sum / list.size();
		return average;
	}
	
	

	public static void main(String[] args) {
		double englishAvg = avg( stu -> stu.getEnglishScore() );
		System.out.println("[���� ���] " + englishAvg + "��");
		
		double mathAvg = avg( stu -> stu.getMathScore() );
		System.out.println("[���� ���] " + mathAvg + "��");
	}

}

package ch14_lambda.ex5_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 95),
			new Student("�̵���", 100, 100)
	);
	
	private static void printString(Function<Student, String> function) {
		for(Student student: list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	private static void printInt(ToIntFunction<Student> function) {
		for(Student student: list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("[�л� �̸�]");
		printString((stu) -> {
			return stu.getName();
		});
		
		System.out.println("[���� ����]");
		printInt( stu -> stu.getEnglishScore() );
		
		System.out.println("[���� ����]");
		printInt( stu -> stu.getMathScore() );
	}

}

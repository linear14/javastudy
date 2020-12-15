package ch14_lambda.ex5_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 95),
			new Student("이동현", 100, 100)
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
		
		System.out.println("[학생 이름]");
		printString((stu) -> {
			return stu.getName();
		});
		
		System.out.println("[영어 점수]");
		printInt( stu -> stu.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( stu -> stu.getMathScore() );
	}

}

package ch16_stream.ex1_2_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "�̵���", "�̺���", "�ٷ���");
		
		// ����ó��
		Stream<String> stream = list.stream();
		stream.forEach(s -> {
			ParallelExample.print(s);
		});
		
		System.out.println();
		
		// ����ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);

	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}

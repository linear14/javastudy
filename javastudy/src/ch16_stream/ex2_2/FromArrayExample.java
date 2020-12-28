package ch16_stream.ex2_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {
		
		String[] strArray = { "이동현", "이보람", "다롱이" };
		Stream<String> stream = Arrays.stream(strArray);
		stream.forEach(s -> System.out.print(s + ", "));

	}

}

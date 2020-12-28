package ch16_stream.ex2_3;

import java.util.stream.IntStream;

public class FromIntRangeExample {

	public static int sum;
	
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(num -> sum += num);
		System.out.println("รัวี : " + sum);
	}

}

package ch16_stream.ex1_2_1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("È«±æµ¿", "ÀÌµ¿Çö", "±èÀÚ¹Ù");
		
		// Iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		// Stream
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);

	}

}

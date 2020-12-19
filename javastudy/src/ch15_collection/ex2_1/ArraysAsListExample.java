package ch15_collection.ex2_1;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("이동현", "이보람", "김자바");
		for(String name: list1) {
			System.out.println(name);
		}
	}

}

package ch15_collection.ex4_1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "È«±æµ¿"), 96);
		map.put(new Student(1, "È«±æµ¿"), 96);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());

	}

}

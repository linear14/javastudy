package ch15_collection.ex2_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList 및 LinkedList add(index, value) 실행 시간 비교 예제
public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime));

	}

}

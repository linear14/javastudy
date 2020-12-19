package ch15_collection.ex3_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("java");
		set.add("database");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println("\t" + str);
		}
		
		System.out.println();
		
		set.remove("jdbc");
		set.remove("JAVA");	// 대소문자를 구분하네
		
		size = set.size();
		System.out.println("총 객체수 : " + size);
		
		for(String str : set) {
			System.out.println("\t" + str);
		}
		
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}

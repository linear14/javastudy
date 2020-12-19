package ch15_collection.ex3_1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("ÀÌµ¿Çö", 26));
		set.add(new Member("ÀÌµ¿Çö", 26));
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + set.size());
		
	}

}

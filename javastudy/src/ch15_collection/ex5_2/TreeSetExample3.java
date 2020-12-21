package ch15_collection.ex5_2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("apple");
		set.add("forever");
		set.add("description");
		set.add("input");
		set.add("ever");
		set.add("everytime");
		set.add("zoo");
		set.add("base");
		set.add("guess");
		set.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = set.subSet("c", true, "f", true);
		for(String word: rangeSet) {
			System.out.println(word);
		}

	}
}

package ch15_collection.ex5_2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(90));
		scores.add(new Integer(75));
		scores.add(new Integer(100));
		scores.add(new Integer(88));
		scores.add(new Integer(94));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score: descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		descendingSet = descendingSet.descendingSet();
		for(Integer score: descendingSet) {
			System.out.print(score + " ");
		}

	}

}

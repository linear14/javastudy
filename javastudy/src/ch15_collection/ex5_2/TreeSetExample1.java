package ch15_collection.ex5_2;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(90));
		scores.add(new Integer(75));
		scores.add(new Integer(100));
		scores.add(new Integer(88));
		scores.add(new Integer(94));
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("94점 가장 가까운 아래점수 : " +scores.lower(94));
		System.out.println("94점 가장 가까운 위 점수 : " + scores.higher(94));
		System.out.println("94점 가장 가까운 이하점수 : " +scores.floor(94));
		System.out.println("94점 가장 가까운 이상점수 : " +scores.ceiling(94));
		
		while(!scores.isEmpty()) {
			System.out.println(scores.pollFirst() + "(남은 객체 수 : " + scores.size() + ")");
		}

	}

}

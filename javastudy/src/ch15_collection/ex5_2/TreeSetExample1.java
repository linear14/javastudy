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
		
		System.out.println("���� ���� ���� : " + scores.first());
		System.out.println("���� ���� ���� : " + scores.last());
		System.out.println("94�� ���� ����� �Ʒ����� : " +scores.lower(94));
		System.out.println("94�� ���� ����� �� ���� : " + scores.higher(94));
		System.out.println("94�� ���� ����� �������� : " +scores.floor(94));
		System.out.println("94�� ���� ����� �̻����� : " +scores.ceiling(94));
		
		while(!scores.isEmpty()) {
			System.out.println(scores.pollFirst() + "(���� ��ü �� : " + scores.size() + ")");
		}

	}

}

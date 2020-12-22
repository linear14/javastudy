package ch15_collection.ex5_3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "������");
		scores.put(95, "������");
		scores.put(80, "���Ҷ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lowerEntry(95);
		entry = scores.higherEntry(95);
		entry = scores.floorEntry(95);
		entry = scores.ceilingEntry(95);
		

	}

}

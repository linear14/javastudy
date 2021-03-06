package ch15_collection.ex5_3;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "������");
		scores.put(95, "������");
		scores.put(80, "���Ҷ�");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> entrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}

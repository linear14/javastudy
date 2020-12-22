package ch15_collection.ex5_3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동");
		scores.put(98, "이동현");
		scores.put(75, "정혜성");
		scores.put(95, "이찬희");
		scores.put(80, "강소라");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lowerEntry(95);
		entry = scores.higherEntry(95);
		entry = scores.floorEntry(95);
		entry = scores.ceilingEntry(95);
		

	}

}

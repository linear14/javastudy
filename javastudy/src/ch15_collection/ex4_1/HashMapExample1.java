package ch15_collection.ex4_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 저장
		map.put("이동현", 100);
		map.put("손오공", 80);
		map.put("단무지", 95);
		map.put("정석", 90);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 객체 찾기
		int score = map.get("이동현");
		System.out.println("\t이동현 점수 : " + score);
		System.out.println();
		
		// 객체를 하나씩 처리 (keySet)
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("단무지");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 객체를 하나씩 처리2 (entrySet)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Map.Entry<String, Integer> entry = iter2.next();
			String keyEntry = entry.getKey();
			int valueEntry = entry.getValue();
			System.out.println("\t" + keyEntry + " : " + valueEntry);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}

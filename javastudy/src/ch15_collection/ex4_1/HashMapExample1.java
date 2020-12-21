package ch15_collection.ex4_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ����
		map.put("�̵���", 100);
		map.put("�տ���", 80);
		map.put("�ܹ���", 95);
		map.put("����", 90);
		System.out.println("�� Entry �� : " + map.size());
		System.out.println();
		
		// ��ü ã��
		int score = map.get("�̵���");
		System.out.println("\t�̵��� ���� : " + score);
		System.out.println();
		
		// ��ü�� �ϳ��� ó�� (keySet)
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("�ܹ���");
		System.out.println("�� Entry �� : " + map.size());
		System.out.println();
		
		// ��ü�� �ϳ��� ó��2 (entrySet)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Map.Entry<String, Integer> entry = iter2.next();
			String keyEntry = entry.getKey();
			int valueEntry = entry.getValue();
			System.out.println("\t" + keyEntry + " : " + valueEntry);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
	}

}

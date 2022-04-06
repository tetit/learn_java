package myProject.practicle.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapQuestions {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "string 1");
		map.put(2, "string 2");
		map.put(13, "string 3");
		map.put(4, "string 4");
		
		System.out.println(map);
		System.out.println("map.get(1)" + map.get(1));
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("Nail", "5");
		m1.put("Oail", "43");
		m1.put("Kail", "23");
		m1.put("Rail", "1");
		m1.put("Bail", "1");
		m1.put("Sail", "1");
		m1.put("Zail", "1");
		System.out.println(m1);
		
		//Value override entrySet()
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.print("key " + key + " value " + value);
		}
		
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.print("key " + key + " value " + value);
		}
		
//		How to Convert Map to List keySet(), values(), entrySet()
		
		List<Integer> keyList = new ArrayList<>(map.keySet());
		List<String> valueList = new ArrayList<>(map.values());
		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
		
		map.put(5, "String5");
		System.out.println(map);
		System.out.println(keyList);
		System.out.println(valueList);
		System.out.println(entryList);
		
		

	}

}

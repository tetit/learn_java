package myProject.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println(map);

		map.put(3, "ThreeOnother");
		System.out.println(map);
		
		System.out.println(map.get(2));
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map.entrySet());
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();  //внутри нет ппорядка данных
		Map<Integer, String> linkedhMap = new LinkedHashMap<Integer, String>();	//в каком порядке пары(ключ, значение)
		//были добавлены, в таком порядке они вернутся
		Map<Integer, String> treMap = new TreeMap<Integer, String>(); //пары (ключ, значение) сортируются по ключу) (естественный порядок)
		
		System.out.println("===============");
		testMap(hashMap);
		System.out.println("===============");
		testMap(linkedhMap);
		System.out.println("===============");
		testMap(treMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(39, "Bob");
		map.put(12, "Ruob");
		map.put(67, "Tin");
		map.put(89, "Bob");
		map.put(1500, "Joni");
		map.put(7, "Tob");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	

}

package arrayList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayListForPractice {

	public static void main(String[] args) {

		// Adding to Git locally

		// ArrayList<Integer> list = new ArrayList<Integer>(10);
		//
		// list.add(10);
		//
		// list.add(40);
		//
		// list.add(1, 5);
		// list.get(0);
		//
		// System.out.println(list);
		//
		// System.out.println(list.size());

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();

		mapFun(linkedMap);

	}

	public static void mapFun(Map<Integer, String> map) {

		map.put(1, "Teng");
		map.put(2, "Zhang");
		map.put(10, "Zhang");
		map.put(55, "Zhang");
		map.put(21, "Zhang");

		for (Integer key : map.keySet()) {

			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
}

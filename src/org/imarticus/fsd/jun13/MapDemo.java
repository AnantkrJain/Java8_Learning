package org.imarticus.fsd.jun13;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.get(20));
	}
}

package collections;

import java.util.*;

public class MapInCollections {
	public static void main(String args[]) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("hello",2);
		hm.put("bye", 3);
		hm.put("test", 5);
		
		System.out.println(hm);
		
		Set<String> hmKeys = new HashSet<>();
		
		hmKeys = hm.keySet();
		System.out.print("{");

		for(String s : hmKeys) {
			System.out.print(s + ":" +hm.get(s)+",");
		}
		System.out.println("}");

	}
}

package collections;

import java.util.*;

public class SetInCollections {
	public static void main(String args[]) {
		
		//generics
		Set hst = new HashSet();
		hst.add("mango");
		hst.add("orange");
		System.out.println(hst.add("bannana"));
		System.out.println(hst.add("bannana"));		
		System.out.println(hst);

		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("fruits");
		lhs.add("vegetables");
		lhs.add("cadbury");
		lhs.add("cadbury");

		
		System.out.println(lhs);

		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(4);
		ts.add(5);
		ts.add(2);
		ts.add(1);
		ts.add(2);

		
		System.out.println(ts);
		System.out.println(ts.descendingSet());

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(String s : lhs) {
			System.out.print(s+",");
		}
	}
}

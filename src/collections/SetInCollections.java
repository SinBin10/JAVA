package collections;

import java.util.*;

public class SetInCollections {
	public static void main(String s[]) {
		Set hst = new HashSet();
		hst.add("mango");
		hst.add("orange");
		hst.add("bannana");
		hst.add("bannana");
		
		System.out.println(hst);

		Set lhs = new LinkedHashSet();
		lhs.add("fruits");
		lhs.add("vegetables");
		lhs.add("cadbury");
		lhs.add("cadbury");

		
		System.out.println(lhs);

	}
}

package collections;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(45);
		al.add(67);
		al.add(354545);
		
		System.out.println(al);
		for(Integer i : al) {
			System.out.print(i+",");
		}
	}
}

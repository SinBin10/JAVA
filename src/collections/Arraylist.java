package collections;

import java.util.*;
public class Arraylist {
	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0] = 45;
		arr[3] = 67;
		System.out.println(arr);
		
		int arr2[] = {23,456,67,56};
		
		for(int x : arr) {
			System.out.print(x+",");
		}
		System.out.println();
		for(int y : arr2) {
			System.out.print(y+",");
		}
		
		//ArrayList al = new ArrayList() ---> 
//		does not have type safety the above thing can store both
//		integer and strings which might cause a problem during runtime
		System.out.println();

		LinkedList<Integer> al = new LinkedList<>();
		al.add(45);
		al.addLast(1000);

		al.add(23);
		al.add(78);
		al.add(56);
		al.addFirst(89);
		al.add(3, 4589);

		al.get(4);
		
		System.out.println("al : "+al);
		System.out.println("al : "+al.get(4));
		
		List<String> lis = new ArrayList<>();
		lis.add("hello");
		lis.add("binay");
		
		System.out.println("list implementation of arraylist : "+lis);

	}
}

package collections;

import java.util.*;
import java.io.*;

public class AssignmentCollections1 {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> li = new LinkedList<>();
		int ch, n, index;
		while(true) {
			System.out.println("1. Add Element at Last : ");
			System.out.println("2. Add Element at First : ");
			System.out.println("3. Add Element at given index : ");
			System.out.println("4. Update the element at given index : ");
			System.out.println("5. Delete the first element : ");
			System.out.println("6. Delete the Last element: ");
			System.out.println("7. Delete the Given element: : ");
			System.out.println("8. Delete the element at given index : ");
			System.out.println("9. Display the elements : ");
			System.out.println("10. Exit : ");
			
			System.out.println("Enter the choice : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the number : ");
					n = sc.nextInt();
					li.addLast(n);
				break;
				case 2:
					System.out.println("Enter the number : ");
					n = sc.nextInt();
					li.addFirst(n);	
				break;
				case 3:
					System.out.println("Enter the number : ");
					n = sc.nextInt();
					System.out.println("Enter the index : ");
					index = sc.nextInt();
					li.add(index, n);	
				break;
				case 4:
					System.out.println("Enter the number : ");
					n = sc.nextInt();
					System.out.println("Enter the index : ");
					index = sc.nextInt();
					li.set(index, n);	
				break;
				case 5:
					li.removeFirst();	
				break;
				case 6:
					li.removeLast();		
				break;
				case 7:
					System.out.println("Enter the number : ");
					n = sc.nextInt();
					li.remove(Integer.valueOf(n));	
				break;
				case 8:
					System.out.println("Enter the index : ");
					index = sc.nextInt();
					li.remove(index);	
				break;
				case 9:
					System.out.println("li : "+li);	
				break;
				case 10:
					System.exit(0);	
				break;
				default:
					System.out.println("Wrong Choice");
			}
		}
	}
}

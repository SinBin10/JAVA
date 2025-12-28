import java.util.*;

public class EnhancedForLoop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int sz = sc.nextInt();
		System.out.println("Enter the numbers now : ");
		int arr[] = new int[sz];
		for(int i = 0;i<sz;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("second maximum number : " + SecondMaximum.findSecondMax(sz, arr));
		
		System.out.println("Entered number : ");
		
		//cannot be used to initialize element inside an array
		//only for iterating and printing the elements
		for(int j : arr) {
			System.out.println(j);
		}
	}
}

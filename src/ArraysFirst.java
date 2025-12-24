import java.util.Scanner;

public class ArraysFirst {
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5};
		
		System.out.println("elements of the array : ");

		for(int i = 0;i<arr.length;i++) {
			System.out.println("i = "+i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the numbers : ");
		for(int i = 0;i<array.length;i++) {
			int input = sc.nextInt();
			array[i] = input;
		}
		
		for(int j = 0;j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		
//		String strarr[] = new String[10];
	}
}

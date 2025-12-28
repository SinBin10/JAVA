import java.util.*;

public class SecondMaximum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int sz = sc.nextInt();
		int arr[] = new int[sz];
		System.out.print("Enter the elements of the array : ");
		for(int i = 0;i<sz;i++) {
			arr[i] = sc.nextInt();
		}
		//[2,5,3,4,7]
		System.out.print("The second maxmimum is : "+findSecondMax(sz, arr));
	}
	
	static int findSecondMax(int sz, int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int j = 0;j<sz;j++) {
			if(arr[j] > max) {
				secondMax = max;
				max = arr[j];
			}
			else
				if(arr[j] > secondMax && arr[j] != max) {
					secondMax = arr[j];
				}
		}
		return secondMax;
	}
}

import java.util.Scanner;

public class biggesttennumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,i = 1;
		int big = Integer.MIN_VALUE;
		System.out.println(big);
		while(i<=10) {
		    System.out.print("Enter the number "+i + ": ");
		    n = sc.nextInt();
		    if(n > big)
		    	big = n;
			++i;
		}
		System.out.println("The biggest number is " + big);
	}
}

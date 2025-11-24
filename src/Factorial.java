import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial is : " + fact(n));
	}
	static int fact(int n){
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}

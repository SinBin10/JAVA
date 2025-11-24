import java.util.Scanner;

public class FactorialPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("------------------");
		System.out.println("Number   Factorial");
		System.out.println("------------------");
		fact(n);
	}

	static void fact(int n) {
		int fact = 1;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			fact *= i;
			sum += fact;
			System.out.println("  " + i + "           " + fact);
		}
		System.out.println("------------------");
		System.out.println("  Sum" + "    =    " + sum);
		System.out.println("------------------");
	}
}

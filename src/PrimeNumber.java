import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n == 1)
			isPrime = false;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n%i == 0)
			{
				isPrime = false;
			}
		}
		System.out.print(isPrime == true ? "Prime" : "Not Prime");
	}
}

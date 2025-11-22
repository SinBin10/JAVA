import java.util.Scanner;

public class Bank {
public static void main(String args[]) {
	int totalAmount = 0,amount = 0;
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Display Balance");
		System.out.println("4.Exit");
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				System.out.print("Enter the amount : ");
				amount = sc.nextInt();
				totalAmount = totalAmount + amount;
				break;
			case 2:
				System.out.print("Enter the amount : ");
				amount = sc.nextInt();
				totalAmount = totalAmount - amount;
				break;
			case 3:
				System.out.println("Total Amount : "+totalAmount);
				break;
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("Wrong Choice !!!");
		}	
	}
}
}

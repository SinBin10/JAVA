import java.util.Scanner;

public class OperationsChoice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("1.Addition");
		System.out.println("2.Multiplication");
		System.out.println("3.Substraction");
		System.out.println("4.Division");
		
		System.out.print("Enter the choice : ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("The sum of the numbers is : "+(n1+n2));
		break;
		case 2:
			System.out.println("The product of the numbers is : "+(n1*n2));
		break;
		default:
			System.out.println("Wrong Choice !!!!");
		break;
		case 3:
			System.out.println("The substraction of the numbers is : "+(n1-n2));
		break;
		case 4:
			System.out.println("The division of the numbers is : "+(n1/n2));
		break;
		}
	}
}

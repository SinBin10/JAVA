import java.util.Scanner;

public class Area {
	public static void main(String args[]) {
		int length;
		int breadth;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		length = sc.nextInt();
		System.out.print("Enter the breadth : ");
		breadth = sc.nextInt();
		System.out.println("The area is : "+length * breadth);
	}
}

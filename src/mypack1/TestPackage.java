package mypack1;

import mypack2.Factorial;

public class TestPackage {
	public static void main(String args[]) {
		int ans = Factorial.fact(4);
		System.out.println("Factorial from pack 2 is "+ans);
	}
}

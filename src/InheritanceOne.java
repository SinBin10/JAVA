class A{
	void show() {
		System.out.println("Show of A....");
	}
}

class B{
	void show() {
		System.out.println("Show of B....");
	}
}

public class InheritanceOne extends A{
	public static void main(String s[]) {
		A obj = new A();
		obj.show();
	}
}

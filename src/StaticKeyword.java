class TestClass{
	static int x;
	int y;
	
	void setValue(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void getValue() {
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
}


public class StaticKeyword {
	public static void main(String args[]) {
		System.out.println("learning core java a little bit...");
	}
}

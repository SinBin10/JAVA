class FirstClass{
	int a;
	String b;
	double d;
	void setValues() {
		a = 3;
		b = "binay";
		d = 89.67;
	}
	void setValuesParameters(int a, String b, double d) {
		this.a = a;
		this.b = b;
		this.d = d;
	}
	
	void getValues() {
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+d);
	}
}

public class ClassesRevision {
	
	//when creating your own constructor 
	// the code does not create its own constructor
	// parameterized constructor, default constructor 
	
	public static void main(String args[]) {
		FirstClass fc = new FirstClass();
		fc.setValues();
		fc.getValues();
		
		FirstClass fc2 = new FirstClass();
		fc2.setValuesParameters(10, "binay", 56.89);
		fc2.getValues();
	}
}

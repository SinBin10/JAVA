//this program shows the difference between local variables
//and data members basically data members can have default value
//as 0 but local variables need to be initalized
class LocalDataMembers {
    int x;
	void test() {
		int n;
		System.out.println(n);
	}
	public static void main(String args[]) {
		LocalDataMembers ldb = new LocalDataMembers();
		System.out.println("value of x = "+ldb.x);
	}
}

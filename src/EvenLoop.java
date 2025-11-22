public class EvenLoop {
	public static void main(String args[]) {
		/*int n = 2;
		while(n <= 100) {
			System.out.print(n+",");
			n+=2;
		}*/
		boolean checkCommas = false;
		int n = 1;
		while(n<=100) {
			if(n % 2 != 0) {
				if(!checkCommas) {
					System.out.print(n);
					checkCommas = true;
				}
				else
				System.out.print(","+n);
			}
			n++;
		}
	}
}

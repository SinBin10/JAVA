package thread;

//must extends the thread class to create a thread
class MyThread extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class Thread1 {
	public static void main(String s[]) {
		MyThread mt = new MyThread();
		mt.start();
		MyThread mt1 = new MyThread();
		mt1.start();
	}
}

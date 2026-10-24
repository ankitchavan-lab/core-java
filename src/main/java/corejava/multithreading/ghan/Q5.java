package corejava.multithreading.ghan;

/*
 * 5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
(use implements method)
 */
class Fifth implements Runnable {
	synchronized private void disp() {
		System.out.println(Thread.currentThread());
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(i);
		}

	}

	synchronized private void disp1() {
		System.out.println(Thread.currentThread());
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

	}

	@Override
	public void run() {
		if (Thread.currentThread().getName() == "First") {
			disp();
		}
		if (Thread.currentThread().getName() == "Second") {
			disp1();
		}
	}

}

public class Q5 {
	public static void main(String[] args) {

		Fifth f1=new Fifth();
		Thread t1=new Thread(f1);
		Thread t2=new Thread(f1);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
	}
}

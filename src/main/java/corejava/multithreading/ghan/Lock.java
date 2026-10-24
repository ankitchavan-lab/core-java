package corejava.multithreading.ghan;
/*
 * 4)create 2 threads. Write a program which displays number 1 to 10 
 * using class lock. 
 * [hint:- use "implements Runnable" and synchronized block]
 */
public class Lock implements Runnable {

	static void disp() {
		// Class cs=Class.forName("Lock")
		// or
		// Lock.class
		synchronized (Lock.class) {
			System.out.println(Thread.currentThread());
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
	}
	@Override
	public void run() {
		disp();
	}
	public static void main(String[] args) {
		Lock l1 = new Lock();
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l1);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
	}
}

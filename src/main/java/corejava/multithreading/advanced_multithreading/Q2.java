package corejava.multithreading.advanced_multithreading;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 2) create a multi-threaded application by using Thread pool.create 2 threads. each thread should 
display numbers from 1 to 10. [ make sure while one thread executes , other thread should not interfere ]
Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to 
display nos. from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.
 */
public class Q2 implements Runnable {

	private void disp() {

		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				try {

					wait();
					System.out.println(Thread.currentThread());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
			notifyAll();
		}
	}

	@Override
	synchronized public void run() {
		disp();
	}

	public static void main(String[] args) {
		Q2 q = new Q2();
		ExecutorService exce = Executors.newFixedThreadPool(2);
		exce.execute(q);
		exce.execute(q);
		exce.shutdown();
	}

}

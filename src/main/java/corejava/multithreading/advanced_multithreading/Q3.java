package corejava.multithreading.advanced_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 
3) create a multi-threaded application by using Thread pool and ReentrantLock (explicit locking) .
create 2 threads. 
each thread should display characters from A to J. [ make sure while one thread executes , 
other thread should not interfere ]
 */

public class Q3 implements Runnable {

	ReentrantLock l1 = new ReentrantLock();

	private void disp() {
		l1.lock();
		System.out.println(Thread.currentThread());
		for (int i = 65; i <= 74; i++) {
			System.out.println((char) i);
		}
		l1.unlock();
	}

	@Override
	public void run() {
		disp();
	}

	public static void main(String[] args) {
		Q3 q = new Q3();
		ExecutorService exc = Executors.newFixedThreadPool(2);
		exc.execute(q);
		exc.execute(q);
		exc.shutdown();

	}
}

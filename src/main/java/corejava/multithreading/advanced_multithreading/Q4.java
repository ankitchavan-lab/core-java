package corejava.multithreading.advanced_multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
4) create a multi-threaded application by using Thread pool and ReentrantLock.create 2 threads. 
each thread should display numbers from 1 to 10. [ make sure while one thread executes , other 
thread should not interfere ] Also when first thread displays nos. from 1 to 5 it should released 
the lock and allow other thread to display nos. from 1 to 5 and then previous thread will display 
nos. from 6 to 10 and so on.
 */
public class Q4 implements Runnable {

	ReentrantLock rl = new ReentrantLock();
	Condition c = rl.newCondition();

	private void disp() {
		rl.lock();
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {

			if (i == 6) {
				try {

					c.await();
					System.out.println(Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
			c.signalAll();
		}
		rl.unlock();
	}

	@Override
	public void run() {
		disp();
	}
	public static void main(String[] args) {
		Q4 q = new Q4();
		ExecutorService exc = Executors.newFixedThreadPool(2);
		exc.execute(q);
		exc.execute(q);
		exc.shutdown();
	}
}

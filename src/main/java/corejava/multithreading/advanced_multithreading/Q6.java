package corejava.multithreading.advanced_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyClass implements Runnable {

	static ReentrantLock r1 = new ReentrantLock();
	static Condition c = r1.newCondition();

	private static void disp() {
		r1.lock();
		synchronized (MyClass.class) 
		{
			System.out.println(Thread.currentThread());
			for (int i = 0; i <= 10; i++) {

				if (i == 6) {
					try {
						c.await();
						System.out.println(Thread.currentThread());
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				}
				System.out.println(+i);
				c.signalAll();
			}
		}
		r1.unlock();
		System.out.println("Out of Lock");
	}

	@Override
	public void run() {

		disp();

	}

}

public class Q6 {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		ExecutorService exce = Executors.newFixedThreadPool(2);
		exce.execute(m);
		exce.execute(m);
		exce.shutdown();

	}

}

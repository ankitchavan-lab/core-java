package corejava.multithreading.simple_multi_day2;

public class ClassLock4 implements Runnable {

	private static void disp() {
		synchronized (ClassLock4.class) {
			// System.out.println(Thread.currentThread());
			for (int i = 0; i < 5; i++) {

				if (i == 3) {
					// System.out.println(Thread.currentThread());
					try {
						(ClassLock4.class).wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Static: " + i);
				(ClassLock4.class).notifyAll();
			}

		}

	}

	@Override
	public void run() {
		disp();

	}

	public static void main(String[] args) {
		ClassLock4 c1 = new ClassLock4();
		ClassLock4 c2 = new ClassLock4();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
	}

}

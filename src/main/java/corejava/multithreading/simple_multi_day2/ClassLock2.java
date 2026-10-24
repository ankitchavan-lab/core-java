package corejava.multithreading.simple_multi_day2;

public class ClassLock2 implements Runnable {
	static Class cs;
	static void disp() {
		System.out.println(Thread.currentThread());
		synchronized (cs) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Static :" + i);
			}
		}
	}
	@Override
	public void run() {
		disp();
	}
	public static void main(String[] args) {
		try {
			cs = Class.forName("ClassLock2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClassLock2 c1 = new ClassLock2();
		ClassLock2 c2 = new ClassLock2();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}

package corejava.multithreading.simple_multi_day2;

public class New implements Runnable {
	// static Class cs;
	static void disp1() {
		synchronized (New.class) {
			for (int i = 0; i < 5; i++) {
				if (i == 3) {
					try {
						(New.class).wait();
					} catch (InterruptedException ie) {
					}
				}
				System.out.println("static " + i);
				(New.class).notifyAll();
			}
		}
	}

	public void run() {
		disp1();
	}

	public static void main(String args[]) {
		// try {
		// cs=Class.forName("New");
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		New c = new New();
		New c1 = new New();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}
}
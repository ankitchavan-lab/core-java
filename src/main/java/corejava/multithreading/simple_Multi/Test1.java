package corejava.multithreading.simple_Multi;

public class Test1 extends Thread {
	@Override
	public void run() {
		// logic for the thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Ankit " + i);
		} // run will be invoked by scheduler
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.setName("Hi");
		System.out.println(Thread.currentThread());
		t1.start();// registering thread
	}
}

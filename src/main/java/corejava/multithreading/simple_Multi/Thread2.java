package corejava.multithreading.simple_Multi;

class Th2 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		// System.out.println(Thread.);
		for (int i = 0; i < 4; i++) {
			System.out.println("Ankit is here " + i);
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		Th2 t1 = new Th2();
		t1.setName("I'm First Thread");
		System.out.println(Thread.currentThread());
		Th2 t2 = new Th2();
		t2.setName("I'm second thread");
		t1.start();
		System.out.println();
		t2.start();
	}
}

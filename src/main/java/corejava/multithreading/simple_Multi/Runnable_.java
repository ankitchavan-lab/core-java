package corejava.multithreading.simple_Multi;
class Ankit implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Chetan Bhamta " + i);
		}
	}
}
public class Runnable_ {
	public static void main(String[] args) {
		Ankit a = new Ankit();
		Thread t1 = new Thread(a);
		t1.setName("First");
		t1.start();
		t1.start();
		Thread t2 = new Thread(a);
		t2.setName("Second");
		t2.start();
	}
}

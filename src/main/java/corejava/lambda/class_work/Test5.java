package corejava.lambda.class_work;

class Monitor {
	synchronized void disp() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		for (int i = 65; i <= 90; i++) {
			System.out.println((char) i);
		}

	}

	synchronized void disp2() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		for (int i = 97; i <= 122; i++) {

			System.out.println((char) i);
		}
	}

}

public class Test5 {

	public static void main(String[] args) {
		Monitor m = new Monitor();
		Thread t1 = new Thread(() -> {
			m.disp();
		}, "First");
		// Thread t2=new Thread(()->{m.disp2();},"Second");
		Runnable ref = () -> {
			m.disp2();
		};
		Thread t2 = new Thread(ref, "Second");
		System.out.println("Implementation name: " + ref.getClass().getName());
		t1.start();
		t2.start();

	}

}

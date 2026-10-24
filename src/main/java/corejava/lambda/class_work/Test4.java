package corejava.lambda.class_work;

public class Test4 {

	public static void main(String[] args) {
		// passing runnable implementation to thread constructor directly using lambda
		// () menas Runnable
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Hello " + Thread.currentThread().getName());
			}
		}, "First");

		Runnable ref = () -> {
			for (int i = 10; i >= 1; i--)
				System.out.println("" + "Welcome " + Thread.currentThread().getName());
		};

		Thread t2 = new Thread(ref, "Second");

		t1.start();
		t2.start();

		System.out.println("*****************************************");
		System.out.println("Name of the Implementation is " + ref.getClass().getName());

	}

}

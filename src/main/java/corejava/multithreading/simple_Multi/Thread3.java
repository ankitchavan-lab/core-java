package corejava.multithreading.simple_Multi;

class Th3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println("Hello  " + Thread.currentThread().getName() + "\t" + i);
			// System.out.println("Ankit is here "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
		Th3 t1 = new Th3();
		t1.setName("First");
		t1.start();
		t1.start();//Voilating the thread life cycle 
	}
}

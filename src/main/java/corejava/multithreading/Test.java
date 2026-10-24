package corejava.multithreading;

/*
 * 4)create 2 threads. Write a program which displays number 1 to 10 
 * using class lock. 
 * [hint:- use "implements Runnable" and synchronized block]
 */
public class Test
{
	//Lock l1;
	void disp() { // method which implements synchronized block

		synchronized (this) { // we are locking object of this class on single thread
			System.out.println(Thread.currentThread());
			for (int i = 1; i <= 10; i++) {

				try {
					//Thread.sleep(80);
					Thread.sleep(80);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}

	
	public static void main(String[] args) {
		
		// Lock l2=new Lock();
		Test z1=new Test();
		Lock l1 = new Lock(z1);
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l1);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
	}
}
class Lock implements Runnable {
	Test z1;
	Lock(Test z1)
	{
		this.z1=z1;
	}
	@Override
	public void run() {
		z1.disp();
	}

	
	}


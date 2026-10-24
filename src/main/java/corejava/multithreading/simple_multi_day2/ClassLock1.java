package corejava.multithreading.simple_multi_day2;

public class ClassLock1 implements Runnable 
{	
	synchronized static void disp() {
		 System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
			System.out.println("Static:"+i );
		}		
	}
	@Override
	public void run() {
		disp();
	}
	public static void main(String[] args) 
	{
		ClassLock1 c1=new ClassLock1();
		ClassLock1 c2=new ClassLock1();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c1);
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
		try {
			t1.join();//caller th/read will wait until both threads die
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Both threads are died");
	}

	
}
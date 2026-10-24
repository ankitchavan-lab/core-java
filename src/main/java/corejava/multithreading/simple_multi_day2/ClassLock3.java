package corejava.multithreading.simple_multi_day2;

public class ClassLock3 implements Runnable
{
	
	static void disp()
	{	//Class cs;
		
		synchronized(ClassLock3.class) {
			System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++)	
		{
			System.out.println("Static :"+i);
		}
		}
		
	}
	@Override
	public void run() {
		disp();
		
	}
	public static void main(String[] args) {
		//Class cs = ClassLock3.class;
		ClassLock3 c1=new ClassLock3();
		ClassLock3 c2=new ClassLock3();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t1.setName("First_Thread");
		t2.start();
		t2.setName("Second_Thread");
	}
	

}

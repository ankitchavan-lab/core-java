package corejava.multithreading.simple_multi_day2;


public class Demon 
{

	public static void main(String[] args) {
		Demon s1=new Demon();
		s1=null;
		//System.gc();
	
		Runtime.getRuntime().gc();
		System.out.println("Done");

	}

	protected void finalize() throws Throwable 
	{
		System.out.println("inside finalized method");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().isDaemon());
		Thread a=Thread.currentThread();
		System.out.println(a.getPriority());
		
	}

}

package corejava.javaseassignments.simple;
/*
 * 7)	create 3 threads in such a way that while 
 * one thread is executing, 2 threads cannot interfere. 
 * they should display output "Exec  0" to "Exec 5"
 */

public class Q7 implements Runnable 
{
	
	synchronized private void disp() 
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exce: "+i);
		}
	}

	
	@Override
	public void run() 
	{
		disp();
	}
	public static void main(String[] args) 
	{
		Q7 q=new Q7();
		Thread t1=new Thread(q);
		Thread t2=new Thread(q);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
	}


}

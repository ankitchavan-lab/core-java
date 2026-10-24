package corejava.viva.pack1;
/*
 * create 3 threads in such a way that while one thread is executing, 
 * 2 threads cannot interfere. 
first thread should display  'A' to 'J'.
second thread should display  1 to 10
third thread should display  'a to j'

[ use implements Runnable technique ]

 */
class MyClass implements Runnable
{

	synchronized void disp1()
	{
		
		if(Thread.currentThread().getName().equalsIgnoreCase("First"))
		{
			System.out.println(Thread.currentThread());
			for(int i=65;i<=74;i++)
			{
				System.out.println((char)i);
			}
		}
		if(Thread.currentThread().getName().equalsIgnoreCase("Second"))
		{
			System.out.println(Thread.currentThread());
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
			}
			
		}
		if(Thread.currentThread().getName().equalsIgnoreCase("Third"))
		{
			System.out.println(Thread.currentThread());
			for(int i=97;i<=106;i++)
			{
				System.out.println((char)i);
			}
		}
	}
	
	public void run() 
	{	
		disp1();	
		
	}
	
}
public class Q1 
{

	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		Thread t3=new Thread(m);
		t1.start();
		t1.setName("First");
		t2.start();
		t2.setName("Second");
		t3.start();
		t3.setName("Third");
		

	}

}

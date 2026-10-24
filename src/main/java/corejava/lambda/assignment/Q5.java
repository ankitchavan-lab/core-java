package corejava.lambda.assignment;
/*
 * 5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of 
"Display" class.
create 2 threads and pass above created "Runnable" implementation to these threads.
make sure while one thread is executing other thread will not interfere.
 */
class Display 
{
	synchronized void disp()
	{
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
public class Q5 {

	public static void main(String[] args) 
	{
		Display d=new Display();
		Runnable ref=()->{d.disp();};
		Thread t1=new Thread(ref,"First");
		Thread t2=new Thread(ref,"Second");
		t1.start();
		t2.start();

	}

}

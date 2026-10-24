package corejava.multithreading.ghan;
/*
 * //3) create 3 threads in such a way that while one thread is 
 * executing, 
//2 threads cannot interfere. they should display output "Exec  0" 
 * to "Exec 5".
 */
class Third implements Runnable
{
	@Override
	synchronized public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exec: "+i);
		}		
	}
}
public class Q3
{
	public static void main(String[] args) 
	{
		Third s1=new Third();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		Thread t3=new Thread(s1);
		t1.start();
		t2.start();
		t3.start();
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");	
	}
}

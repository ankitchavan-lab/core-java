package corejava.multithreading.ghan;
/*
 * //1) create a multi-threaded application by using  
 * "Runnable" interface method.create 2 threads. 
//they should display characters from A to J.
 */
class Second implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)i);
		}
		
	}
	
}
public class Q2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Second s1=new Second();
		Second s2=new Second();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
	}

}

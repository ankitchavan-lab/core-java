package corejava.multithreading.ghan;
/*
 * //1) create a multi-threaded application by using 
 *  "extends Thread " method.create 2 threads. 
//they should display characters from A to J.
 */
class First extends Thread
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
public class Q1 {
	public static void main(String[] args) {
		First f1=new First();
		First f2=new First();
		f2.start();
		f1.start();	
	}
}







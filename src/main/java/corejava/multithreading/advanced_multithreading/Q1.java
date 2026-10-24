package corejava.multithreading.advanced_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 1) create a multi-threaded application by using Thread pool.
 * create 2 threads. each thread 
 * should display characters from A to J. [ make sure while 
 * one thread executes , other thread 
 * should not interfere ]
 */
public class Q1 implements Runnable 
{
	synchronized private void disp() 
	{
		System.out.println(Thread.currentThread());
		for(int i=65;i<=74;i++)
		{
			System.out.println((char)i);
		}
	}
	@Override
	public void run() 
	{
		disp();
	}	
	public static void main(String[] args) {
		Q1 ref=new Q1();
		ExecutorService exce=Executors.newCachedThreadPool();
		exce.execute(ref);
		exce.execute(ref);
		exce.execute(ref);
		exce.shutdown();
	}
}

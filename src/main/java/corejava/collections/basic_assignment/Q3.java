package corejava.collections.basic_assignment;
/*
 * 3) add 5 numbers inside CopyOnWriteArrayList 
 * and show how can you add one more number at the same time of traversal through its iterator.
 */

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> mylist=new CopyOnWriteArrayList<Integer>();//thread safe
		System.out.println("Enter The values");
		for(int i=1;i<=5;i++)
		{
			int temp;
			temp=sc.nextInt();
			mylist.add(temp);
		}
		System.out.println("Now Removing some elements \n");
		mylist.remove(new Integer(3));
		Iterator<Integer> itr=mylist.iterator();
		System.out.println("Printing Elements (Iteration 1)");
		while(itr.hasNext())
		{
			mylist.add(3);//appended on snapshot 1 2 4 5 3 3 3 3
			System.out.print(itr.next()+" ");//original copy 1 2 4 5
		}
		Iterator<Integer> itr1=mylist.iterator();
		System.out.println("\nPrinting Elements (Iteration 2)");
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}
		

	}

}

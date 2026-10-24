package corejava.collections.basic_assignment;

import java.util.*;

/*
 * 1) accept 10 numbers from user and add them inside the ArrayList.
using ListIterator display all the numbers bidirectionally.
 */
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		List<Integer> mylist=new ArrayList<Integer>();
		
	
		for(int i=1;i<=10;i++)
		{
			int temp;
			System.out.println("Enter value at "+"["+(i-1)+"]");
			temp=sc.nextInt();
			mylist.add(temp);
		}
		ListIterator<Integer> itr=mylist.listIterator();
		System.out.println("In Forward order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("In Backward order");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}

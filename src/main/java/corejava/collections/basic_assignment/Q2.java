package corejava.collections.basic_assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 
2) create LinkedList with the values 10,20,30 and 40.
display it.
now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.
 */
public class Q2 
{
	public static void main(String[] args) 
	{
			List<Integer> mylist=new LinkedList<Integer>();
			mylist.add(10);
			mylist.add(20);
			mylist.add(30);
			mylist.add(40);
			System.out.println("Size of LinkedList is: "+mylist.size()+"\n");
			Iterator<Integer>itr=mylist.iterator();
			System.out.println("Before adding elements");
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("Adding nodes inside list\n");
			mylist.add(0,500);
			mylist.add(1, 400);
			mylist.add((mylist.size()),1000);
			Iterator<Integer>itr1=mylist.iterator();
			System.out.println("Printing Elements again ");
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
	}

}

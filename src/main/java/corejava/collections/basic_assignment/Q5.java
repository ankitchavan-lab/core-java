package corejava.collections.basic_assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 5) create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.
 */
public class Q5 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> mymap=new HashMap<Integer,String>();
		mymap.put(016, "Ankit");
		mymap.put(133, "Mayur");
		mymap.put(234, "Akshay");
		mymap.put(564, "Ghanshyam");
		mymap.put(999, "Chetan");
		mymap.put(122, "Pranav");
		mymap.put(014, "Dipak");
		mymap.put(067, "Tushar");
		mymap.put(023, "Pradip");
		mymap.put(013, "Mahesh");
		//mymap.forEach();
		
		//Getting Iterator in Map
		// get a set of entries
		Set<Entry<Integer,String>> set=mymap.entrySet();
				// get an iterator
		Iterator<Entry<Integer,String>> itr=set.iterator();
				// display elements
		while(itr.hasNext())
		{ 
			System.out.println(itr.next());
		
		}
	
	}

}

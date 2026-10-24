package corejava.collections.basic_assignment;
/*
 * 8) maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Rohit Sharma".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Jos Butler");
		map.put(3, "Rohit Sharma");
		map.put(2, "Babar Azam");
		map.put(5, "KL Rahul");
		map.put(6, "David Warner");
		map.put(8, "Shikhar Dhawan");
		map.put(4, "Virat Kohali");
		map.put(9, "Araon Finch");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rank in betweeen 1 to 9 to get Batsman");
		int a;
		a=sc.nextInt();
		System.out.println(map.get(new Integer(a)));

	}

}

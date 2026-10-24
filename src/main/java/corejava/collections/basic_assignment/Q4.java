package corejava.collections.basic_assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 4) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
 */
class MyClass implements Serializable
{
	
}
public class Q4 
{

	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		MyClass m3=new MyClass();
		MyClass m4=new MyClass();
		
		List<MyClass> mylist=new ArrayList<MyClass>();
		mylist.add(m);
		mylist.add(m1);
		mylist.add(m2);
		mylist.add(m3);
		mylist.add(m4);
		System.out.println("Serializing ArrayList\n");
		
		try(FileOutputStream fos =new FileOutputStream("C:\\FileIO\\Collection\\second.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(mylist);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deserializing ArrayList \n");
		ArrayList<MyClass> ref=null;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Collection\\second.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(ArrayList<MyClass>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Now Reading From Deserialized Object\n");
		Iterator<MyClass> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

			
	}

}

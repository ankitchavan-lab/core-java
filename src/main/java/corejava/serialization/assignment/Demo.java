package corejava.serialization.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * Demo class with main
	create one object of Student, write it inside file and then read.
 */
public class Demo {

	public static void main(String[] args) 
	{
		Student s1=new Student("Ankit", 24, 016);
		System.out.println(s1.getName());
		System.out.println(s1.getRoll_no());
		System.out.println(s1.getAge());
		///now serialization
		
		
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Serializeass2.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student ref=null;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Serializeass2.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(Student) ois.readObject();
					
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
		System.out.println("Serialization and Deserialization Done");
		System.out.println(ref.getName());
		System.out.println(ref.getAge());
		System.out.println(ref.getRoll_no());		
	}

}

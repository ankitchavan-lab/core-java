package corejava.serialization.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo1 implements Serializable
{
	String name;
	int age;
	int id;
	transient Thread t1=new Thread();
	

	public Demo1(String name, int age, int id) 
	{
		this.name = name;
		this.age = age;
		this.id = id;
		//this.t1 = t1;
	}


	public static void main(String[] args) 
	{
		Demo1 d=new Demo1("Ankit",24,016);//creating normal object
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Serialization\\serialization1.txt"))//creating object of file
		{	
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(d);//serializing object to filesystem
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name: "+d.name+"\tAge: "+d.age+"\tId: "+d.id+"\t"+d.t1);
		d=null;//dereferancing 
		//Now Deserialization;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Serialization\\serialization1.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			Demo1 d1=(Demo1) ois.readObject();//creating object of the object which is in file
			System.out.println(d1.name +"\t"+d1.age+"\t"+d1.id+"\t"+d1.t1);
			d1.t1=new Thread();
			d1.t1.start();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
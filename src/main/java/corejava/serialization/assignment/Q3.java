package corejava.serialization.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 3) Define a class "Car" with
	private int id and private String modelname;
	setters and getters
	create 2 objects of Car and write them inside 
	filesystem and thereafter read both the 
	objects and display.
 */
class Car implements Serializable
{
	private int id;
	private String modelname;
	
	public void setId(int  id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setModelName(String modelname)
	{
		this.modelname=modelname;
	}
	public String getModelName()
	{
		return modelname;
	}
}

public class Q3 
{
	
	public static void main(String[] args) 
	{
		Car c1=new Car();
		Car c2=new Car();
		c1.setId(12);
		c1.setModelName("Swift");
		c2.setId(22);
		c2.setModelName("Alto");
		
		
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Serializableass3.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(c2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car ref1=null;
		Car ref2=null;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Serializableass3.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref1=(Car) ois.readObject();
			ref2=(Car) ois.readObject();
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
		System.out.println(ref1.getId()+"\t"+ref1.getModelName());
		System.out.println(ref2.getId()+"\t"+ref2.getModelName());

	}

}

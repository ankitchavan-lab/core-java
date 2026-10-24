package corejava.serialization.basic;

import java.io.*;

//Serialization in case of Inheritance
//base class constructor will get call if it's not 
//implementing Serializable interface
class A
{
	int num1=20;
}
public class Demo2 extends A implements Serializable
{
	int num2=10;
	public static void main(String[] args) 
	{
		Demo2 d=new Demo2();
		d.num1=100;//changing base class value//as child class got base class object inside it
		d.num2=200;//changing child class value
		try(FileOutputStream fos =new FileOutputStream("C:\\FileIO\\Serialization\\demo2.txt"))	
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			System.out.println("Serialization is done now initalizing child class from file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Normal object values num1(base): "+d.num1+"\tnum2(child) :"+d.num2);
		//closing both objects 
		d=null;//now d is marked for garbage collection	
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Serialization\\demo2.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				Demo2 d1=(Demo2) ois.readObject();//creating object of the object which is in file
				System.out.println("Num1: "+d1.num1+"\tNum2: "+d1.num2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}

}

package corejava.serialization.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 1)create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)
 */
class Customer implements Serializable 
{	
	private  int custid;
	private String custname;
	private String address;
	private int age;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Q1 {

	public static void main(String[] args) 
	{
		Customer c=new Customer();
		c.setCustid(100);
		c.setAge(24);
		c.setCustname("Ankit");
		c.setAddress("Nashik");
		System.out.println(c.getCustid()+"\t"+c.getCustname());
		System.out.println(c.getAddress()+"\t"+c.getAge());
		//Serialization
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\SerializeAss1.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//serialization done
		System.out.println("Serialization Done");
		Customer ref=null;
			//Deserialization
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\SerializeAss1.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(Customer) ois.readObject();
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
		System.out.println("");
		//Deserialization Done
		//now accessing the member from created object after deserialization
		System.out.println(ref.getCustid()+"\t"+ref.getCustname());
		System.out.println(ref.getAge()+"\t"+ref.getAddress());

	}

}

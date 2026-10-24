package corejava.serialization.customizestion_in_serialization;
//we are directly using customized deserialization

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyAccount implements Serializable
{
	private int id;
	private transient String pwd="Tiger";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private void readObject(ObjectInputStream o) throws ClassNotFoundException,IOException
	{
		o.defaultReadObject();
		pwd="Tiger";
	}
}
public class Demo1 {

	public static void main(String[] args) 
	{
		MyAccount m=new MyAccount();
		m.setId(12);
		System.out.println("UserID: "+m.getId()+"\tPassword: "+m.getPwd());
		System.out.println("Let's Serialize");
		
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Cust_Serialization\\demo1.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(m);
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		MyAccount des=null;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Cust_Serialization\\demo1.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			des=(MyAccount) ois.readObject();
			
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
		System.out.println("Deserialization Done");
		System.out.println("UseID "+des.getId()+"\tPassword: "+des.getPwd());
		
	}

}

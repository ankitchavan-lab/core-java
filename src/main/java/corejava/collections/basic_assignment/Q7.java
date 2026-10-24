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
 * 7) Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.

 */
class Employee implements Serializable
{
	private int empid;
	private String name,desig;
	private double basic_salary;
	
	public Employee(int empid, String name, String desig, double basic_salary) 
	{
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.basic_salary = basic_salary;
	}
	public void disp()
	{
		System.out.println("["+empid+" "+name+" "+desig+" "+basic_salary+"]");
	}
	
	
	
}
public class Q7 {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(128,"Ankit","Fullstack Developer",76000);
		Employee emp2=new Employee(132,"Akashay","Senior Fullstack Developer",95600);
		Employee emp3=new Employee(112,"Chetan"," Data Scientist",125000);
		Employee emp4=new Employee(123,"Mayur","CEO",150000);
		List<Employee>mylist=new ArrayList<Employee>();
		mylist.add(emp1);
		mylist.add(emp2);
		mylist.add(emp3);
		mylist.add(emp4);
		
		try(FileOutputStream fos=new FileOutputStream("C:\\FileIO\\Collection\\Q7employee.txt"))
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
		ArrayList<Employee> ref=null;
		try(FileInputStream fis=new FileInputStream("C:\\FileIO\\Collection\\Q7employee.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(ArrayList<Employee>) ois.readObject();
			
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
		System.out.println("Reading Deserialized ArrayList Object\n");
		
		Iterator<Employee>itr =mylist.iterator();
		
		while(itr.hasNext())
		{
			itr.next().disp();
		}
	}

}

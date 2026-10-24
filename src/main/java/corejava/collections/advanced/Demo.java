package corejava.collections.advanced;

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
 * class Employee
	private int empid
	private String name,desig
	private double salary
	parameterized constructor
	toString method
create 4 objects of Employee
create an arraylist of Employee and store these 4 objects.
create an iterator and traverse throught the arraylist
now store this arraylist inside filesytem and also read.
 */
class Employee implements Serializable {
	private int empid;
	private String name, desig;
	private double salary;

	public Employee(int empid, String name, String desig, double salary) {
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[" + empid + " " + name + " " + desig + " " + salary + "]\n";
	}
}
public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(21, "Mayur", "Developer", 20398);
		Employee e2 = new Employee(21, "Ankit", "Basic Developer", 456945);
		Employee e3 = new Employee(21, "Tushar", "Junior Developer", 66498);
		Employee e4 = new Employee(21, "Akshay", "Senior Software Developer", 90237);
		List<Employee> mylist = new ArrayList<Employee>();
		mylist.add(e1);
		mylist.add(e2);
		mylist.add(e3);
		mylist.add(e4);
		Iterator<Employee> itr = mylist.iterator();
		System.out.println("Traversing through Iterator\n");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		/// List is done
		// Now serialization
		System.out.println("Serializing mylist(ArrayList)\n");

		try (FileOutputStream fos = new FileOutputStream("C:\\FileIO\\Collection\\arraylist1.txt")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mylist);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/// Serialization Done
		ArrayList<Employee> ref = null;
		try (FileInputStream fis = new FileInputStream("C:\\FileIO\\Collection\\arraylist1.txt")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			ref = (ArrayList<Employee>) ois.readObject();

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
		System.out.println("Reading mylist(ArrayList) from file\n");
		Iterator<Employee> itr2 = ref.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}

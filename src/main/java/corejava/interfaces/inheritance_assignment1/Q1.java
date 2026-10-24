package corejava.interfaces.inheritance_assignment1;
/*1) Create a multi-level inheritance , instantiate the 
child class and observe constructor invocation.Also show, 
if needed how will u invoke parent class constructor 
from child class ?*/
class Person
{	String name;
	public Person()
	{
		System.out.println("In base class constructor");
	}
	public Person(String name)
	{
		this.name=name;
	}
}
class Employee extends Person
{
	int Id;
//	public Employee()
//	{
//		System.out.println("In Employee class constructor");
//	}
	public Employee(int id)
	{
		super("Ankit");
		this.Id=id;
	}
}
class Ankit extends Employee
{
	public Ankit()
	{ 	
		super(23);
		System.out.println("In Ankit class constructor");
	}
	public Ankit(String name,int id)//child class paramerterized constructor
	{
		super(23);
	}
}
public class Q1 
{

	public static void main(String[] args) 
	{
		Ankit a1=new Ankit();
		System.out.println();
		//this will invoke all parent and grand parent classes as they got default constructors
		//what if we want to invoke paramerterizerd constructor of Base class?
		//we should use super keyword in child class constructor
		//also we should define paramerterized constructor in child class
		Ankit a2=new Ankit("Ankit",1213);

	}

}

package corejava.methodreference.assignments;
/*
 * 7) define a class "Student" with name and age as member variables, parameterized constructor , setters , 
getters and "toString" method. 
define a functional interface "MyInterface" with an abstract method "void show(Student ref)"
 */
interface MyInterface
{
	void show(Student ref);
}
class Student
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		//System.out.println("Inside Student parameterized constructor");
	}
	

	public Student() 
	{
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
public class Q7
{
	/*
	 * 
inside main function 
a) create an instance of "Student" class by passing "Vijay" and '20' values.
b) create method reference for "MyInterface" and display the instance of "Student" class created above.

	 */
	public static void main(String[] args) 
	{
		Student s=new Student(20,"Vijay");
		
		MyInterface ref=System.out::println;
		ref.show(s);
	}
	
}

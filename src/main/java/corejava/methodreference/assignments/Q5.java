package corejava.methodreference.assignments;
/*
 * 5) define a functional interface "Emp" with an abstract method "void show()".
define a class "MyClass" with default constructor with the message "inside default constructor of MyClass".

inside main function instantiate "MyClass" using method reference to "Emp"
 */
interface Emp
{
	void show();
}
class MyClass
{
	int id;
	String s;
	public MyClass(int id, String s) 
	{
		System.out.println("Inside Paranerterized constructor\n");
		this.id = id;
		this.s = s;
	}
	public MyClass() {
		System.out.println("Inside no arg constructor\n");
	}
	
	
}
public class Q5 {

	public static void main(String[] args) 
	{
		System.out.println("Using lambda");
		Emp e=()->{new MyClass();};
		e.show();
		System.out.println("Using Method Ref");
		Emp e2=MyClass::new;
		e2.show();
	}

}

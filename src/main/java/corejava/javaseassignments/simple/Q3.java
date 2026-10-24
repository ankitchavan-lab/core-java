package corejava.javaseassignments.simple;
/*
 * 3)	define static initializers in the above A,B and C classes and check the order of their execution.
 */
class A1
{
	static
	{
		System.out.println("In class A Static");
		
	}
	static
	{
		System.out.println("In class A second Static");
		
	}
}
class B1
{
	static
	{
		System.out.println("In class B Static");
		
	}
	static
	{
		System.out.println("In class B second Static");
		
	}
}
class C1
{
	static
	{
		System.out.println("In class C Static");
		
	}
	static
	{
		System.out.println("In class C second Static");
		
	}
}
public class Q3 {
	public static void main(String[] args) 
	{
		A1 a=new A1();
		B1 b=new B1();
		C1 c=new C1();
	}
}

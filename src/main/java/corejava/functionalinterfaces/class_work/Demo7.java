package corejava.functionalinterfaces.class_work;

interface empc
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface empb extends empc
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClassb implements empb
{
	// must be public
	public String disp2()
	{
		System.out.println(empb.super.disp2());
//System.out.println(emp.super.disp2()); 
		// Illegal reference to super type emp, cannot bypass the more specific direct super type emp1

		return "in overridden method of MyClass";
	}
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo7
{
	public static void main(String args[])
	{
		MyClassb m=new MyClassb();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		

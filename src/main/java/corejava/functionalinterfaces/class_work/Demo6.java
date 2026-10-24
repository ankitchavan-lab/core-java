package corejava.functionalinterfaces.class_work;

interface emp98
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp00 extends emp98
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClass7 implements emp00
{
	// must be public
	public String disp2()
	{
		return "in overridden method of MyClass";
	}
	public String disp1()
	{
		return "in disp1";
	}
}
public class Demo6
{
	public static void main(String args[])
	{
		MyClass7 m=new MyClass7();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		
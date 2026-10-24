package corejava.functionalinterfaces.class_work;
//package trial;
interface emp32
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp11
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class xyz9
{
	public String disp2()
	{
		return "in disp2 of xyz";
	}
} 
class MyClass00 extends xyz implements emp32,emp11
{
	public String disp2()  
	//we can override the method in our class from xyz class(Class1)
	{
		return "in disp2 of MyClass";
	}
	public String disp1()
	// as though both interfaces having same name but we are overriding with public in class 
	{
		return "in disp1";
	}
}
public class Demo4_b
{
	public static void main(String args[])
	{
		MyClass00 m=new MyClass00();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
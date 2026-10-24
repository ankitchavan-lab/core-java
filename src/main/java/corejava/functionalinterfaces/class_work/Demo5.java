package corejava.functionalinterfaces.class_work;
interface emp23
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp56 extends emp23
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class MyClass44 implements emp56
{
	public String disp1()//again we are overrideing with public
	{
		return "in disp1";
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		MyClass44 m=new MyClass44();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
		
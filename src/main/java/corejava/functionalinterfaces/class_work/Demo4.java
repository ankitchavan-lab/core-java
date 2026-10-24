package corejava.functionalinterfaces.class_work;


interface emp6
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp";
	}
}
interface emp1
{
	String disp1();
	default String disp2()
	{
		return "in disp2 of emp1";
	}
}
class xyz
{
	public String disp2()
	{
		return "in disp2 of xyz";
	}
} 
class MyClass9 extends xyz implements emp6,emp1
{
	
	public String disp1()  //this method is from xyz so no problem 
	{						//it must be public
		return "in disp1";
	}
	
}
public class Demo4
{
	public static void main(String args[])
	{
		MyClass9 m=new MyClass9();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}
}
			
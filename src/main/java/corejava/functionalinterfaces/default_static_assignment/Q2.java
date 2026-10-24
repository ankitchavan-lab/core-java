package corejava.functionalinterfaces.default_static_assignment;
/*
 * 2) define interface "Third" with "default void disp1()" and 
"static void disp2()" methods.
derive a class "Sub" from "Third" ( do not override "disp1")
inside main function invoke "disp1" and "disp2" methods.
 */
interface Third 
{
	default void disp1()
	{
		System.out.println("In Third default disp");
	}
	static void disp2()
	{
		System.out.println("In Third Static");
	}
}
class Sub implements Third
{
	{
		Third.super.disp1();
		
	}
}

public class Q2 
{

	public static void main(String[] args) 
	{
		Sub s1=new Sub();
		Third.disp2();
		
	}

}

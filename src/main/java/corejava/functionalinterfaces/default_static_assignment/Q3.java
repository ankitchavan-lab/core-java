package corejava.functionalinterfaces.default_static_assignment;
/*
 * 3)define interface "Fourth" with "default void disp3()" method.
define a class "Base1" with "public void disp3()" method,
now derive a class Sub1 from "Base1" and "Fourth". Sub1 class 
should have only "public void myfun()" method.
inside main create an object of "Sub1" and invoke "disp3".
once you get the result, also try to invoke "disp3" of "Fourth"

 */
interface Fourth
{
	default void disp3()
	{
		System.out.println("In Fourth disp");
	}
}
class Base1
{
	public void disp3()
	{
		System.out.println("In Base1 disp");
	}
}
class Sub1 extends Base1 implements Fourth
{
	public void myFun()
	{
		Fourth.super.disp3();
		//System.out.println("In Sub1 myFun");
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
		Sub1 s=new Sub1();
		s.disp3();
		s.myFun();
	}

}

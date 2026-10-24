package corejava.functionalinterfaces.default_static_assignment;
/*
 * 4) define interface "Base11" with "default void fun1()".
derive an interface "Sub1" from "Base1" with "default void fun2()"
derive a class "Sub2" from "Sub1". It should have only "public void fun3()" method.
 */
interface Base11
{
	default void fun1()
	{
		System.out.println("In Base1 fun1");
	}
}
interface Sub11 extends Base11
{
	default void fun2()
	{
		Base11.super.fun1();
		//System.out.println("In Sub11 fun2");
	}
}
class Sub2 implements Sub11
{
	public void fun3()
	{
		Sub11.super.fun2();
		System.out.println("In Sub2 fun3");
	}
}
/*
 * inside main function, create an object of "Sub2" and make sure when u invoke "fun3", 
it should call "Sub1's fun2" which should call "Base1's fun1" method.
 */
public class Q4 
{

	public static void main(String[] args) 
	{
		Sub2 s=new Sub2();
		s.fun3();
	}

}

package corejava.functionalinterfaces.default_static_assignment;
/*
 * 1) define interface "First" with "default void fun()" and interface "Second" with 
 * "default void fun()". 
Now derive a class Child from both these interfaces. 
Inside main function instantiate Child class instance and invoke "fun" method.
 */
interface First
{
	default void fun()
	{
		System.out.println("In first disp");;
	}
}
interface Second
{
	default void fun()
	{
		System.out.println("In second disp");
	}
}
class Child implements First,Second
{

	@Override
	public void fun() 
	{
		First.super.fun();
		Second.super.fun();
	}
	
}
public class Q1 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.fun();

	}

}

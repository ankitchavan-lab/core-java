package corejava.lambda.assignment;
/*
 * 
1) define a functional interface "First" with an abstract method "void disp1()" , 
default method "void disp2()" and a static method "void disp3()"
 */
interface First
{
	void disp();
	default void disp2()
	{
		System.out.println("In Default");
	}
	static void disp3()
	{
		System.out.println("In Static");
	}
}
/*
 * inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
also invoke "disp3()" method inside main.
 */
public class Q1 
{

	public static void main(String[] args) 
	{
		
		First ref=()->{System.out.println("In abstract method");};
		ref.disp();//abstract method call
		ref.disp2();//default method
		First.disp3();//static method on interface name 
		
		
	}

}

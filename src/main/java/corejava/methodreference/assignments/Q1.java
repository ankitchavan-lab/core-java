package corejava.methodreference.assignments;
/*
 * 1) define a functional interface "First" with an abstract method "void disp1()".
define a class "Second" with a method "void fun1()"
 */
interface First
{
	void disp();
}
class Second 
{
	void fun1()
	{
		System.out.println("In Fun");
	}
}
public class Q1 {
//inside main function create a method reference for "First" and invoke "fun1" of "Second"
	public static void main(String[] args) 
	{
		Second s=new Second();
		First ref=s::fun1;
		ref.disp();
		
	}

}

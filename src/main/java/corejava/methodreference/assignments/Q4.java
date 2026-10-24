package corejava.methodreference.assignments;
/*
 * 4) define a functional interface "Sixth" with an abstract method "void disp5()".
define a class "Sample" with a static method "void fun1()"

inside main function create a method reference for "Sixth" and invoke "fun1" of "Sample"
 */
interface Sixth
{
	void disp5();
	
}
class Sample1
{
	static void fun1()
	{
		System.out.println("In Sample static\n");
	}
}
public class Q4 {

	public static void main(String[] args) 
	{
		System.out.println("Using lambda");
		Sixth s=()->{Sample1.fun1();};
		s.disp5();
		System.out.println("Using Method ref");
		Sixth k=Sample1::fun1;
		k.disp5();
	}

}

package corejava.methodreference.assignments;
/*
 * 
2) define a functional interface "Third" with an abstract method "void show(int num)".
define a class "Sample" with a method "void disp(int num)"

inside main function create a method reference for "Third" and invoke "disp" of "Sample" 
by passing a value "500".
 */
interface Third
{
	void show(int num);
}
class Sample
{
	void disp(int num)
	{
		System.out.println("Number pass to the show() is "+num);
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		Third t=s::disp;
		t.show(200);

	}

}

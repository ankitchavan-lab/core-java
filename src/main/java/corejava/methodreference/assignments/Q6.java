package corejava.methodreference.assignments;
/*
 * 6) define a functional interface "Seventh" with an abstract method "void fun(int k)".
define a class "Test" with parameterized constructor with the message "inside parameterized constructor 
of Test\t"+k .

inside main function instantiate "Test" by passing value "200" using method reference to "Seventh"

 */
interface Seventh 
{
	void fun(int k);
}
class Test
{
	public Test(int num)
	{
		System.out.println("Inside Test parameterized Constructor "+num+"\n");
	}
	
}
public class Q6 {

	public static void main(String[] args) 
	{
		//using lambda
		System.out.println("Using Lambda");
		Seventh s=(a)->{new Test(a);};
		s.fun(200);
		System.out.println("Using method ref");
		Seventh l=Test::new;
		l.fun(200);
	}

}

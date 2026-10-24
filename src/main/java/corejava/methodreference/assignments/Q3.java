package corejava.methodreference.assignments;
/*
 * 3) define a functional interface "Fifth" with an abstract method "int add(int a,int b)"
define a class Math1 with a method "int calc(int a,int b)" 

inside main function invoke "calc" method with the help of
	a) lamdba expression
	b) method reference
 */
interface Fifth
{
	int add(int a,int b);
}
class Math1
{
	int calc(int a,int b)
	{
		System.out.println("Addition of the two numbers is ");
		return a+b;
	}
}
public class Q3 {

	public static void main(String[] args) 
	{
		Math1 m=new Math1();
		//using lambda
		System.out.println("Using Lambda");
		Fifth f=(a,b)->{return m.calc(a, b);};
		System.out.println(f.add(34, 6));
		System.out.println("****************************************\nUsing method ref");
		//now using method reference 
		Fifth h=m::calc;
		System.out.println(h.add(34, 6));
		
	}

}

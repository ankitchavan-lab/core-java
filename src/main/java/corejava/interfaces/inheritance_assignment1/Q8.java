package corejava.interfaces.inheritance_assignment1;
/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have 
following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned 
constructors.*/
class Base1
{ 	
	int a;
	public Base1(int a)
	{
		this.a=a;
		
	}
	
}
class Sub1 extends Base1
{
	int b,c;
//	public Sub1()
//	{
//		//super(int a);// can't use it 
//	}
	public Sub1(int b,int a)
	{
		super(a);
		this.b=b;
	}
	public Sub1(int b,int c,int a)
	{
		super(a);
		this.b=b;
		this.c=c;		
	}
	
}
public class Q8 
{

	public static void main(String[] args) 
	{
		
		//Sub1 s1=new Sub1();//we can't instantiate class 
		//Sub1 without arguments as Base class doesn't have default constructor
		Sub1 s2=new Sub1(21,22);
		Sub1 s3=new Sub1(24,24,76);
		
	}

}

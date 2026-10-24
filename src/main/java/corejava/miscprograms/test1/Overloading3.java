package corejava.miscprograms.test1;
class base3
{
	void disp(Object ref)
	{
		System.out.println("In Object disp");
	}
}
class sub3 extends base3
{
	void disp(String ref)
	{
		System.out.println("In String disp");
	}
} 
public class Overloading3 
{

	public static void main(String[] args) 
	{
	base3 b=new sub3();
	b.disp("Hello");//late binding//as base has object it will invoke  on object only
	
	sub3 s=new sub3();
	s.disp("Welcome");
	s.disp(100);
	}

}

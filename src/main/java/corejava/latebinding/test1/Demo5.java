package corejava.latebinding.test1;
class base5 
{
	static void disp()
	{
		System.out.println("In base disp");
		
	}
}
class sub5 extends base5
{
	static void disp(int k)
	{
		System.out.println("Sub disp");
	}
}

public class Demo5 
{

	public static void main(String[] args) 
	{
		sub5 s=new sub5();
		s.disp();//complier understands sub is type of base
		s.disp(89);

	}

}

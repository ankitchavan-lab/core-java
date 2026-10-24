package corejava.miscprograms.test1;
class base
{
	static int a=10;
	static
	{
		System.out.println("In base static");
	}
	
}
class sub extends base
{
	//static int a=20;
	static
	{
		System.out.println("in sub static");
	}
}
public class Main
{

	public static void main(String[] args) 
	{
		System.out.println(sub.a);//compiler will see sub is of type base(compiler understands relation) 
								//and provide value of static int a which in base

	}

}

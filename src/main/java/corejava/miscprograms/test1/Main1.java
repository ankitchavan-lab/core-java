package corejava.miscprograms.test1;
class base1
{
	static int a=10;
	static
	{
		System.out.println("In base static");
	}
	
} 
class sub1 extends base
{
	static int a=20;
	static
	{
		System.out.println("in sub static");
	}
}
public class Main1
{

	public static void main(String[] args) 
	{
		System.out.println(sub1.a);//compiler will see sub is of type base(compiler understands relation) 
								//and provide value of static int a which in base

	}

}

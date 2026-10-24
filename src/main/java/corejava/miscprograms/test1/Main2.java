package corejava.miscprograms.test1;
class parent
{
	static void disp(int k)
	{
		System.out.println("parent disp");
	}
	static
	{
		System.out.println("Parent static block");
	}
}
class child extends parent
{
	static void disp()
	{
		System.out.println("Child disp");
	}
	static
	{
		System.out.println("Child static block");
	}
}
public class Main2 
{

	public static void main(String[] args) 
	{
		//child.disp(4);//compiler understands the relation between child and parent
		child.disp();

	}

}

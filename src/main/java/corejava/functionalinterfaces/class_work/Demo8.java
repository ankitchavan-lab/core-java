package corejava.functionalinterfaces.class_work;
interface member
{
	int k=10;
	String a="Hello";
	default void disp()
	{
		System.out.println(+k);
		
	}
}
class A implements member
{

	@Override//from interface with public
	public void disp() 
	{ 
		
		member.super.disp();
	}
	
}
public class Demo8 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.disp();
		System.out.println(member.k);
		System.out.println(A.k);
		System.out.println(member.a);
		System.out.println(A.a);
		
		
	}
	
}

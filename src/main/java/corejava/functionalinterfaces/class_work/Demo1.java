package corejava.functionalinterfaces.class_work;
@FunctionalInterface
interface emp
{
	String disp();
	default String disp2()
	{
		//default method
		return "In disp2";		
	}
}
class MyClass implements emp
{
	//Overriding Default method
	public String disp() 
	{	
		return "In disp1";
	}
}

public class Demo1 
{
	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		System.out.println(m.disp());
		System.out.println(m.disp2());
	}
}
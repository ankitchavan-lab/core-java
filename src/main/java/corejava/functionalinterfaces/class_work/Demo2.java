package corejava.functionalinterfaces.class_work;
// ambiquity error as both the interfaces are having same name default methods
@FunctionalInterface
interface emp2
{
	String disp();
	default String disp2()
	{
		//default method
		return "In disp2";
		
	}
}
interface second
{
	String disp();
	default String disp2()
	{
		//default method
		return "In disp2";
		
	}
}
//class MyClass2 implements emp2,second
//{
//	@Override
//	public String disp() 
//	{
//		// TODO Auto-generated method stub
//		return "In Class Disp";
//	}
		
//	ambiquity error
//
//	
//}

public class Demo2 {

	public static void main(String[] args) 
	{
		//MyClass2 m=new MyClass2();
		//System.out.println(m.disp());
		
	}

}

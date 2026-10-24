package corejava.functionalinterfaces.class_work;
// ambiquity error as both the interfaces are having same 
//name default methods
@FunctionalInterface
interface emp3
{
	String disp();
	default String disp2()
	{
		//default method
		return "In disp2";	
	}
}
interface second2
{
	String disp();
	default String disp2()
	{
		//default method
		return "In disp2";
		
	}
}
class MyClass4 implements emp3,second2
{
	@Override
	public String disp() 
	{
		// TODO Auto-generated method stub
	return "In Class Disp";
	}

	@Override
	public String disp2() {
		// TODO Auto-generated method stub
		return "In disp2";
	}	
}

public class Demo3 {

	public static void main(String[] args) 
	{
		MyClass4 m=new MyClass4();
		System.out.println(m.disp2());
	}

}

package corejava.miscprograms.test1;

class MyClass4
{
	static void disp1()
	{
		System.out.println("In disp1");
	}
	void disp2()
	{
		System.out.println("In disp2");
	}
}
public class Null 
{

	public static void main(String[] args) 
	{
		MyClass4 m=null;
		m.disp1();//in disp 1 //static method
		m.disp2();//NullPointerException
		
		

	}

}

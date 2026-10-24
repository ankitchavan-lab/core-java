package corejava.latebinding.test1;
class Base7
{
	private void disp()
	{
		
		System.out.println("in base disp");
	}
}
class Sub7 extends Base7
{
	void disp()
	{
		
	}
}

public class Demo7 
{

	public static void main(String[] args) 
	{
		Base7 ref=new Sub7();
		//ref.disp();// error as private is not accessible in main

	}

}

package corejava.miscprograms.test1;
interface myinterface
{
	void disp1();
	void disp2();
}
class sub11 implements myinterface
{

	@Override
	public void disp1() 
	{
		
		System.out.println("disp1");
	}

	@Override
	public void disp2() 
	{
		System.out.println("disp2");
		
	}
	public void print()
	{
		System.out.println("Print");
	}
	 
}

public class InterfaceDemo 
{

	public static void main(String[] args) 
	{
		myinterface ref=new sub11();
		ref.disp1();
		ref.disp2();
		//ref.print();//error
		System.out.println(ref.toString());
	}

}

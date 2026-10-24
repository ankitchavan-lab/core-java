package corejava.latebinding.test1;
class base6
{
	final void disp()
	{
		System.out.println("in base disp");
	}
}
class sub6 extends base6
{
//	void disp()
//	{
//		System.out.println("In sub disp");
//	}
}
public class Demo6
{

	public static void main(String[] args) 
	{
		base6 s1=new sub6();
		s1.disp(); 
		
	}

}

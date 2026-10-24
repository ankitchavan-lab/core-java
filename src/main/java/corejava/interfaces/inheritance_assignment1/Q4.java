package corejava.interfaces.inheritance_assignment1;
/*4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and 
"Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/
class Top1
{
	public void disp1()
	{
		System.out.println("In Top1");
	}
}
class Bottom1 extends Top1
{
	public void disp1()
	{	
		System.out.println("In Bottom1");
	}
}
class Bottom2 extends Top1
{
	public void disp1()
	{
		System.out.println("In Bottom2");
	}
}
class Bottom3 extends Top1
{
//	public void disp1()
//	{
//		System.out.println("In Bottom3");
//	}
}
public class Q4 
{

	static void perform(Top1 ref)
	{
		ref.disp1();//dynamic polymorphism becuase on run-time disp1() will call on 
					//content which will holded by ref
	}
	public static void main(String[] args) 
	{
		perform(new Bottom1());
		System.out.println();
		perform(new Bottom2());
		System.out.println();
		perform(new Bottom3());
	}

}

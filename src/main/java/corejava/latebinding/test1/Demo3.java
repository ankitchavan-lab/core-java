package corejava.latebinding.test1;
class base3
{
	static void disp()
	{
		System.out.println("in base disp");
	}
}
class sub3 extends base3
{
//	void disp()
//	{
//		System.out.println("In sub disp");
//	}
}
public class Demo3
{

	public static void main(String[] args) 
	{
		sub s1=new sub();
		s1.disp();//it will invoke static method  disp
					//type of s1 is considered 
		base ref=new sub();
		ref.disp();//content will not check at run time
					//type of ref is considered 

	}

}

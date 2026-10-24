package corejava.miscprograms.practice;
class Base
{
	String disp()
	{
		System.out.println("Base disp");
		return null;
	}
	public String toString()
	{
		return "Base";
	}
}
class sub extends Base
{
	String disp()
	{
		System.out.println("In sub disp");
		return null;
	}
	public String toString()
	{
		return "Sub";
	}
}

public class Test1 {

	public static void main(String[] args) {
		Base b1=new sub();
		b1.disp();
		//System.out.println(b1);//b1.toString()

	}

}

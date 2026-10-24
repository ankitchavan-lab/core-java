package corejava.latebinding.test1;
class sub8 extends Demo8
{
	void disp()
	{
		System.out.println("sub disp");
	}
}
public class Demo8 
{
	private void disp()
	{
		System.out.println("in Demo8 disp");
	}
	public static void main(String[] args) 
	{
		Demo8 ref = new sub8();
		ref.disp();

	}

}

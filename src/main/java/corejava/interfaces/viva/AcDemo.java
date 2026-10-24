package corejava.interfaces.viva;
abstract class Account
{
	public abstract void calint();
}
class Saving extends Account 
{

	@Override
	public void calint() 
	{
		System.out.println("In saving");
	}
	
}
class RD extends Account
{

	@Override
	public void calint() 
	{
		System.out.println("In RD");
		
	}
	
}
class Current extends Account
{

	@Override
	public void calint() 
	{
	
		System.out.println("In current");
	}
	
}


public class AcDemo 
{
	static void perform(Account ref)
	{
		ref.calint();
		
	}
	public static void main(String[] args) 
	{
		perform(new Saving());

	}

}

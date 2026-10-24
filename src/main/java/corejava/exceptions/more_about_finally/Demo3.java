package corejava.exceptions.more_about_finally;

public class Demo3 
{
	void accept(int num)
	{
		if(num<=0)
			throw new RuntimeException("Invalid Input");
	}
	int disp(int num)
	{
		try 
		{
			accept(num);
			System.exit(0);
			return 1;
		}
		catch(Exception ee)
		{
			
			return 2;
			
		}
		finally
		{
			System.out.println("nekejn");
			return 3;
		}
	}
	public static void main(String[] args) 
	{
		Demo3 d1=new Demo3();
		//System.out.println(d1.disp(9));
		System.out.println(d1.disp(-9));
	}
}
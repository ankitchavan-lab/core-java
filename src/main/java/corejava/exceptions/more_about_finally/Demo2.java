package corejava.exceptions.more_about_finally;

public class Demo2 
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
			return 1;
		}
		catch(Exception ee)
		{
			//ee.printStackTrace();
			return 2;
			
		}
		finally
		{
			System.out.println("Hello");
			String s="Hello";
			s=null;
			System.out.println(s.length());//NullPointerException
					
			return 3;
		}
	}

//	int  disp1(int num)
//	{
//		 return disp(num);
//	}
	

	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2();
		//System.out.println(d1.disp(0));
		System.out.println(d1.disp(-9));//execution aboorts
		


	}
}

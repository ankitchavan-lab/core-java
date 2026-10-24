package corejava.assertionexceptioncopy.object_workwith_check;

//not allowed to write a Objet in cathch block
public class Demo1 
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
		catch(Exception ee)//Not Allowed
		{
			//ee.printStackTrace();
			return 2;
			
		}
//		catch(Object ee)//Not Allowed
//		{
//			//ee.printStackTrace();
//			return 2;
//			
//		}
		finally
		{
			return 3;
		}
	}
//	int  disp1(int num)
//	{
//		 return disp(num);
//	}
	

	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		//System.out.println(d1.disp(0));
		System.out.println(d1.disp(9));
		


	}

}

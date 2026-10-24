package corejava.exceptions.classpractice;
//finally always gets executed 
//whether exception raised or not it will always gets executed 
//it is use to release resources
// it is alternate for protected finalized() method which gets invoke before garbage collection
//but we don't know when jvm will do automatic garbage collection
//we should not relay on it
//it will not get executed if itself raises an exception
//also if there is "system.exit(0);" is above it or inside it it will not get executed
//S.O.P. statements will gets executed in finally 
//irrespective of  whether its return any value or not 
public class finallly
{

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		System.out.println("Test Started");
		try 
		{
			arr[2]=25000;
			System.out.println("Value is: "+arr[2]);
			arr[22]=100;
			arr[1]=3000;
			System.out.println("Value is: "+arr[1]);
		}
		catch(Exception ee)
		{	
			ee.printStackTrace();
			ee.printStackTrace();
			//System.exit(0);
			
		}
		finally
		{
			
			System.out.println("I'm always gets executed");
		}
		System.out.println("Test end");
	}

}



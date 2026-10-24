package corejava.exceptions.classpractice;

//The most generic block
//Specific + generic catch block
public class Example3 {

	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		Example3 e1=new test();
		
		
		System.out.println("Test Start");
		//test t1=(test)e1;
		try{
			
			arr[2]=200;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}//specific catch block should precedes generic catch block
		catch(Exception ee)
		{
			System.out.println("Generic Catch block");
			System.out.println(ee);
		}
		System.out.println("Test End");
	}

}
class test extends Example3
{
	
	
}
class next extends Example3
{

}

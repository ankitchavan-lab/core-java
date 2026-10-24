package corejava.exceptions.classpractice;

/*one try block multiple catch box*/

public class Example2
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		Example2 e1=null;
		System.out.println("Array created");
		try
		{
			//arr[2]=10;
			arr[4]=10; //ARRAY EXCEPTion
			e1.toString();//NullPointerException
		}
		catch(ArrayIndexOutOfBoundsException ae) 
		{
			System.out.println(ae);
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		System.out.println("Array assigned");
	}
}

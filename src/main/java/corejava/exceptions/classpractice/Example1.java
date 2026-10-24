package corejava.exceptions.classpractice;

public class Example1 
{
	
	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		
		System.out.println("Array created");
		try {
		arr[4]=100;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
			System.out.println("I'm Catching Exception so i will be executed");
			System.out.println(ae);
		}
		System.out.println("I will be printed as exception is handled");
		

	}

}

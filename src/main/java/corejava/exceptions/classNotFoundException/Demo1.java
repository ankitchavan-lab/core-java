package corejava.exceptions.classNotFoundException;

public class Demo1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//is method from class "Class" which is 
			//use to load class at runtime
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		System.out.println("done");
	}
}

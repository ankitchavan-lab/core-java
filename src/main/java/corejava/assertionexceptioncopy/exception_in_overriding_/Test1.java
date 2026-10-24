package corejava.assertionexceptioncopy.exception_in_overriding_;
//Overriding method may not declare any checked exception
//because that can be handle in main 
import java.io.IOException;

class Base
{
	public void disp() throws IOException
	{
		
	}
}
class sub1 extends Base
{
	public void disp()//overriding method may not declare checked exception 
	{
		
	}
}	

public class Test1 {

	public static void main(String[] args) 
	{
		Base ref=new sub1();//we need to handle checked exception somewhere or declare it 
		try 
		{
			ref.disp();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Base ref1=new Base();
		//ref1.disp(); again we need to either handle or declare Checked Exception

	}

}

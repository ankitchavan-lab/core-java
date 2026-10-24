package corejava.assertionsexceptions.exception_in_overriding_;

import java.io.IOException;

//overriding method can not declare checked exception not declared by overridden method

class X
{
	public void disp()
	{
		
	}
}
class Y extends X
{
	public void disp()throws RuntimeException
	{
			//its allowed because its unchecked exception and no need to handle or declare it 	
	}
//	public void disp() throws IOException
//	{
//		// we can't declare checked exception in overriding method if overridden method doesn't declare it
//	}
}
class P 
{
	public void disp()throws IOException//, Exception    // we need to declare it in overridden method if we want to declare it in 
	// overriding method
	{
		
	}
}
class Q extends P
{
//	public void disp()throws Exception
//	{
//	  //Error    //as it is not declare in the overridden method
//	}
	}
	
public class Test3 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

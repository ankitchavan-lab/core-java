package corejava.assertionsexceptions.exception_in_overriding_;

import java.io.EOFException;
import java.io.IOException;

//Overriding method can declare same checked exception or sub type declare in overridden method
//here overrridinng method has sub type of checked exception which is declare inn overridden method
class A
{
	public void disp() throws IOException
	{
		
	}
}
class B extends A
{
	public void disp() throws EOFException//we are declaring sub-type of checked exception (IOException)
	//as of overridden method 
	{
		
		
	}
}
public class Test2_b {

	public static void main(String[] args) {
		A ref=new B();//again we have to handle it somewhere so we are handling it in main which is calling method
		try {
			ref.disp();//if exception occurs it will get handle in try catch block and our flow of execution won't be terminate or disturb
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package corejava.assertionsexceptions.exception_in_overriding_;

import java.io.IOException;
//Rule 2nd 
// overriding method can declare same checked exception or sub type off it declare in overridden method
///Here they both overridden and overriding methods  are having same checked exception declaration 
class Parent
{
	public void disp()throws IOException
	{
		
		
	}
}
class Child extends Parent
{

	@Override
	public void disp() throws IOException 
	{
		super.disp();
		
		
	}
	
}
public class Test2_a {

	public static void main(String[] args) {
		Parent ref= new Child();
		try {
			ref.disp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Parent p1=new Parent();
		//p1.disp();//Handling or declaring is mandatory

	}

}

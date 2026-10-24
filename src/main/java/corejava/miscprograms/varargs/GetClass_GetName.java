package corejava.miscprograms.varargs;
class Coder_Ankit
{
	void disp()
	{
		System.out.println("My  full name is: "+getClass());
		System.out.println("My name  is: "+getClass().getSimpleName());
		System.out.println(getClass());
	}	
}

public class GetClass_GetName 
{

	public static void main(String[] args) 
	{
		Coder_Ankit a1=new Coder_Ankit();
		a1.disp();
		
	}

}

package corejava.strings.string1;

public class Demo8 
{

	public static void main(String[] args) 
	{
		String s1="Hello";//created on string poll
		
		if(s1=="Hel"+"lo")// compiler will add these string and then it will check 
							//will create on string pool
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}

package corejava.strings.string1;

public class Demo9 
{

	public static void main(String[] args) 
	{
		String s1="Hello";//created on string poll
		String s2="Hel";
		
		if(s1==s2+"lo")// compiler will add these string and then it will check 
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

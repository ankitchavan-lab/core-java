package corejava.strings.string1;

public class Demo10 
{

	public static void main(String[] args) 
	{
		String s1=new String("Hello");//created on string poll
		
		
		if(s1=="Hel"+"lo")// compiler will add these string and then it will check 
							//will create on string pool
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");//false as s1 is outside string poll 
					//will return addres from string poll which is different from outside which s1 has 
		}

	}

}

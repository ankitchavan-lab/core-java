package corejava.strings.string1;

public class Demo5 
{

	public static void main(String[] args) 
	{
			
			String s1="Hello";
			String s2=new String("Hello");
			
			
			System.out.println(s1);
			System.out.println(s2);
			
			//How to make s1==s2 true in this case without changing syntax
			//2000		2000
			if(s1==s2.intern())//== is faster than equals method
				//it will check in string pool that is there any string same as s2 if yes it will retun that address to s2
				//then condition will be checked
				//if not new string will be created on string pool and that address will be returned and condition will false
				//as new string got diff address as s1 got 
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}

			
			

	}

}

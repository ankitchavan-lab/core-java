package corejava.strings.string1;

public class Demo7 
{

	public static void main(String[] args) 
	{
			String s1="admin";
			String s2="Admin";
					
			if(s1.equals(s2))//equals() method is overrriden
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}
			if(s1==s2)
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}
			if(s1.equalsIgnoreCase(s2))//equalsIgnoreCase() method is overrriden from String class
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}

			System.out.println(s1.hashCode());//hasCode() is also overriden
			System.out.println(s2.hashCode());
		
			

	}

}

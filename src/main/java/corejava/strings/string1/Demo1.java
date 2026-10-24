package corejava.strings.string1;

public class Demo1 
{

	public static void main(String[] args) 
	{
		String str=new String("Hello");
		System.out.println(str);//toString() method is overriden in String class
		String str1=new String("Hello");
		
		if(str.equals(str1))//equals() method is overrriden
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		if(str==str1)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

		System.out.println(str.hashCode());//hasCode() is also overriden
		System.out.println(str1.hashCode());
		
		
		
	}

}

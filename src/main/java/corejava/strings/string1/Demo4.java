package corejava.strings.string1;

public class Demo4 
{

	public static void main(String[] args) 
	{
			String s1=new String("Hello");
			String s2="Hello";
			String s3=s2;
			s3="Ankit";//will create new object in string poll and jvm returns the address of new string which will be stored in s3
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			if(s1.equals(s2))//equals() method is overrriden
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}
			if(s1==s3)
			{
				System.out.println("Strings are equal");
			}
			else
			{
				System.out.println("Strings are not equal");
			}

			System.out.println(s1.hashCode());//hasCode() is also overriden
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			

	}

}

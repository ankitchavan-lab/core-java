package corejava.strings.string1;

public class Demo6 
{

	public static void main(String[] args) 
	{
			String s1="Hello";
			String s2=s1.concat(" World");//immutable this will create outside String pool
			
			System.out.println(s1);
			System.out.println(s2);//toString is override
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());

	}

}

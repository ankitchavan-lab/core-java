package corejava.miscprograms.practice;

class Base1
{
	static int count;
	{
		count++;
	}
	
}
public class ObjectCounter 
{

	public static void main(String[] args) 
	{
		Base1 b1=new Base1();
		Base1 b2=new Base1();
		Base1 b3=new Base1();
		System.out.println(Base1.count);

	}

}

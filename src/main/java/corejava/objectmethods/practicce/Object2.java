package corejava.objectmethods.practicce;
class MyClass1
{
	int num;
	public MyClass1(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return "["+num+"]";
	}
}

public class Object2 
{

	public static void main(String[] args) 
	{
		MyClass1 m1=new MyClass1(100);
		MyClass1 m2=new MyClass1(100);
		
		System.out.println(m1);
		System.out.println(m2);

	}

}

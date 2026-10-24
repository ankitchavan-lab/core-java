package corejava.objectmethods.practicce;
class MyClass
{
	private int num;
	
	public MyClass(int num)
	{
		this.num=num;
	}
	
}
public class Object1 
{

	public static void main(String[] args) 
	{
		MyClass m1=new MyClass(100);
		
		System.out.println(m1.toString());
		System.out.println(m1);

	}

}

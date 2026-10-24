package corejava.objectmethods.practicce;
class MyClass5
{
	int num;
	public MyClass5(int num)
	{
		this.num=num;
	}
	public boolean equals(Object ref)
	{
		return this.num==((MyClass5)ref).num;	
	}
	public int hashCode()
	{
		return num;
	}
}

public class Object5 
{

	public static void main(String[] args) 
	{
		MyClass5 m1=new MyClass5(200);
		Object m2=new MyClass5(200);
		if(m1.equals(m2))
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}

}

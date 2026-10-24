package corejava.objectmethods.practicce;
class MyClass3
{
	int num;
	public MyClass3(int num)
	{
		this.num=num;
	}
	public boolean equals(Object ref)
	{
		return this.num==((MyClass3)ref).num;
	}
}

public class Object4 
{

	public static void main(String[] args) 
	{
		MyClass3 m1=new MyClass3(200);
		MyClass3 m2=new MyClass3(200);
		if(m1.equals(m2))
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}
		
	}

}

package corejava.objectmethods.practicce;

class MyClass2
{
	int num;
	public MyClass2(int num)
	{
		this.num=num;
	}
}
public class Object3 
{

	public static void main(String[] args) 
	{
		MyClass2 m1=new MyClass2(100);
		MyClass2 m2=new MyClass2(100);
		
		
		if(m1.equals(m2))
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}
		if(m1==m2)
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}
		MyClass2 m3=m1;
		System.out.println();
		System.out.println("Assigning m1 to m3");
		System.out.println();
		if(m1.equals(m3))
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}
		if(m1==m3)
		{
			System.out.println("M1 and M2 are equal");
		}
		else
		{
			System.out.println("M1 and M2 are not equal");
		}

	}

}

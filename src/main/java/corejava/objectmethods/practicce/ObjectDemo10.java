package corejava.objectmethods.practicce;
/*
	when two objects are equal as per equals() method, 
	invoking "hashCode()" on them must return same int value.
*/


class MyNum       // developer
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
	public boolean equals(Object ref)  
	{
		return this.num==((MyNum)ref).num;
	}
	public int hashCode()
	{
		return num;
	}
}
public class ObjectDemo10
{
	public static void main(String args[])     // client
	{
		MyNum m1=new MyNum(100);
		Object m2=new MyNum(100);
		if(m1.equals(m2))  
		{
			System.out.println("m1 and m2 are equals");
		}
		else
		{
			System.out.println("m1 and m2 are not equals");
		}
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
	

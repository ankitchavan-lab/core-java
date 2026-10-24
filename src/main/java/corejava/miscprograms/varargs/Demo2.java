package corejava.miscprograms.varargs;
class A
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class B
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class C
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class D
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
public class Demo2 
{
	static void disp(Object...col)
	{
		for(int i=0;i<col.length;i++)
		{
			System.out.println(col[i]+" ");
			
		}
		for(Object ob:col)
		{
			System.out.println(ob+" ");
		}
	}
	public static void main(String[] args) 
	{
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		D ob4=new D();
		disp(ob1,ob2,ob3,ob4);
	}

}

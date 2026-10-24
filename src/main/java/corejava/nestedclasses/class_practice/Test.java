package corejava.nestedclasses.class_practice;


class A1 
{
	public A1(int k)
	{
		System.out.println("inside A parameterized constructor\t"+k);
	}
}
public class Test {

	A1 getA()
	{
		return new A1(2)
		{
			public String toString()
			{
				return getClass().getName();
			}
		};
	}
	public static void main(String[] args) {
		
		Test m=new Test();
		A1 ref=m.getA();
		System.out.println(ref);
	}

}


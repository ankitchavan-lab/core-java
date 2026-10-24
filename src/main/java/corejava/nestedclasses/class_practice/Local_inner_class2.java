package corejava.nestedclasses.class_practice;
class A
{
	int a;

	public A(int a) {
	
		this.a = a;
		System.out.println("Inside paramerterized constructor");
	}
	
}

public class Local_inner_class2 {

	A getA()
	{
		return new A(3)
				{

					@Override
					public String toString() 
					{
						return getClass().getName();
					}
					
				};
		
	}
	public static void main(String[] args) {
		Local_inner_class2 l1=new Local_inner_class2();
		A ref=l1.getA();
		System.out.println(ref);

	}

}

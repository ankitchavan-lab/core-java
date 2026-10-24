package corejava.functionalinterfaces.class_work;
interface w
{
	int s=25;
	//void disp();
	default void disp1()
	{
		System.out.println("in interface disp");
	}
}
class K 
{
	//must be public in order to avoid ambiguity and to achieve  class wins rule
	public void disp1()
	{
		
		System.out.println("In Superclass Disp");
	}

}
class C extends K implements w
{
		
}

public class ClassWins 
{

	public static void main(String[] args) 
	{
		C c=new C();
		c.disp1(); //interfaces losses for backward compatibility
		//so if interface got same function as class in future 
		//inherited class will get method from superclass only 
		//because we will add new method in interface as default 
		//so its upto class weather it has to override that or not

	}

}

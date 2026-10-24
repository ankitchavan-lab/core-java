package corejava.interfaces.inheritance_assignment1;
/*3) Go for Hierarchical inheritance, create instances of child class and 
observe constructor invocation.
 * */
class Birds 
{
	public Birds()
	{
		System.out.println("In Parent Constructor");
	}
}
class Hen extends Birds
{
	public Hen()
	{
		System.out.println("In child hen's constructor");
	}
}
class Eagle extends Birds
{
	public Eagle()
	{
		System.out.println("In child eagle's constructor");
	}
}
class Duck extends Birds
{
	public Duck()
	{
		System.out.println("In child duck's constructor");
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
			Eagle e1=new Eagle();
			System.out.println();
			Duck d1=new Duck();
			System.out.println();
			Hen h1=new Hen();
				
		
	}

}

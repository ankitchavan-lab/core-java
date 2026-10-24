package corejava.interfaces.inheritance_assignment1;

/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as 
derived from parent interfaces.*/
interface A
{
	public void disp1();
}
interface B extends A
{
	public void disp2();
}
class C implements B
{	public void dispC()
	{
		System.out.println("Disp of C");
	}
	@Override
	public void disp1() 
	{
		System.out.println("Disp of A");
	}

	@Override
	public void disp2() 
	{
		System.out.println("Disp of B");
	}
	
}
public class Q6 
{

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.dispC();
		System.out.println();
		c1.disp1();
		System.out.println();
		c1.disp2();

	}

}

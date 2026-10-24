package corejava.functionalinterfaces.default_static_assignment;
/*
 * 5) define interface "First1" with "static void disp1()" method.
class "Base2" with "static void disp2()" method.
derive a class "Sub4" from "Base2" and "First1"
 */
interface First1
{
	static void disp()
	{
		System.out.println("In First disp");
	}
}
class Base2
{
	static void disp2()
	{
		System.out.println("In base2 disp");
	}
}
class Sub4 extends Base2 implements First1
{
	
}
public class Q5 
{
	/*
	 * now define a class Demo1 in which define "main" method.
		inside main show how many ways you can invoke "disp1" and "disp2" methods.
	 */
	public static void main(String[] args) 
	{
			Sub4 s=new Sub4();
			First1.disp();
			s.disp2();
	}

}

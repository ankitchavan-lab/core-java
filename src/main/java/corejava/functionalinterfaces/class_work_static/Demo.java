package corejava.functionalinterfaces.class_work_static;

interface a
{
	static void disp()
	{
		System.out.println("In interface static");
		
	}
}
class N implements a
{
	static void disp()
	{
		System.out.println("In class static");
	}
	void disp2()
	{
		System.out.println("In class non static");
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		N n=new N();
		//System.out.println();
		n.disp2();//non static of class
		N.disp();//static of class
		a.disp();//static of interface
		
	}

}

package corejava.miscprograms.test1;


public class Overloading 
{
	void disp(Object o)
	{
		System.out.println("In object disp");
	}
	void disp(String o)
	{
		System.out.println("In string disp");
	}
	public static void main(String[] args) 
	{
		Overloading d=new Overloading();
		d.disp("Hello");//will give proritty nearest class
		d.disp(null);//will give proritty nearest class
		d.disp(10);//can only applied to Object

	}

}

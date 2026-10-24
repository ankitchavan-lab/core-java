package corejava.miscprograms.test1;


public class Overloading2 
{
	void disp(Object o)
	{
		System.out.println("In object disp");
	}
	/*void disp(String o)
	{
		System.out.println("In string disp");
	}*/
	public static void main(String[] args) 
	{
		Overloading2 d=new Overloading2();
		d.disp("Hello");//
		d.disp(null);//
		d.disp(10);//

	}

}

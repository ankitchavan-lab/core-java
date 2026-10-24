package corejava.generics.lecture_wale;
class Shape
{
	
}
class rect extends Shape
{
	
}
class Circle extends Shape
{
	
}
class Triangle extends Shape
{
	void disp()
	{
		System.out.println("In Triangle ");
		
	}
}
class Common<T>
{
	private Shape ob;

	public Common(Shape ob) 
	{
		this.ob = ob;
	}

	public Shape getOb() 
	{
		return ob;
	}	
}

public class Demo2 {

	public static void main(String[] args) 
	{
		Common c1=new Common(new Triangle());
		Triangle ref=(Triangle) c1.getOb();
		ref.disp();
		System.out.println("In main "+ref);
	

	}

}

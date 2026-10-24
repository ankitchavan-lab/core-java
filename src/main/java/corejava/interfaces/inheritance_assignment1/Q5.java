package corejava.interfaces.inheritance_assignment1;
/*5) create abstract class Shape. declare "draw()" function as 
abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/
abstract class Shape
{
	abstract public void draw();
}
class Triangle extends Shape
{
	
	public void draw() 
	{
		System.out.println("In triangle draw");
	}
}
class Polygon extends Shape
{
	
	public void draw() 
	{
		System.out.println("In polygon draw");
		
	}
}
class Circle extends Shape
{
	public void draw() 
	{
		
		System.out.println("In circle draw");
	}
}

public class Q5 
{

	public static void main(String[] args) 
	{
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Circle ();
		arr[2]=new Polygon();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
			System.out.println();
		}
			
	}

}

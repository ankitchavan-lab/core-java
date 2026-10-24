package corejava.clientexamples.clipentpack;
/*on Client side:
define "ShapeDemo" class with main function
create an array of "Shape" with 3 elements. store objects of 
Triangle,Rect and Circle in this array. now traverse the array 
and invoke "draw()" of each child.
*/
import corejava.interfaces.interface_assignments.*;
public class ShapeDemo {

	public static void main(String[] args) 
	{
			Shape arr[]=new Shape[3];
			arr[0]=new Triangle();
			arr[1]=new Circle();
			arr[2]=new Rectangle();
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i].draw();
			}
			
			
	}

}

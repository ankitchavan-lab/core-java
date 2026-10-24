package corejava.clientexamples.clipentpack;

import corejava.interfaces.interface_assignments.*;

/*
on Client side:
define "ShapeDemo" class with main and perform functions
define perform function in such a way that given any shape 
it can invoke "draw()" of it.*/
public class ShapeDemo2 
{
	static void perform(Shape ref)
	{
		ref.draw();
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		perform(new Triangle());
		perform(new Circle());
		perform(new Rectangle());

	}

}

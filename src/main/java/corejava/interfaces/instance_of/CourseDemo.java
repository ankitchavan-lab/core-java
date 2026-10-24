package corejava.interfaces.instance_of;
/*create a hierarchy
Course
void start()
void end()
override "start()" and "end()" in all the child classes.
MsCit		Basic		Dbda
void orientation()
write a class "CourseDemo" with main and perform functions
perform function should be defined in such a way that it can 
accept any course and invoke "start()" and "end()" functions.
also make sure if "Dbda" is passed , its "orientation()" method 
also should be called.*/
class Course
{
	public void start()
	{
		
	}
	public void end()
	{
		
	}
}
class Mscit extends Course
{

	public void start()
	{
		 System.out.println("MSCIT course start");
	}
	public void end()
	{
		System.out.println("MSCIT course end");
	}
}
class Basic extends Course
{
	public void start()
	{
		System.out.println("Basic course start");
	}
	public void end()
	{
		System.out.println("Basic course end");
	}
	
}
class Dbda extends Course
{
	public void start()
	{
		System.out.println("DBDA course start");
	}
	public void orientation()
	{
		System.out.println("DABA orientation program");
	}
	public void end()
	{
		System.out.println("DBDA course end");
	}

}
public class CourseDemo 
{
	static void perform(Course ref)
	{
		ref.start();
		if(ref instanceof Dbda)
		{
			Dbda d1=(Dbda)ref;
			d1.orientation();
		}
		ref.end();
	}
	public static void main(String[] args) 
	{
		perform(new Mscit());
		System.out.println();
		perform(new Basic());
		System.out.println();
		perform(new Dbda());

	}

}

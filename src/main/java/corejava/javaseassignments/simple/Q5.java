package corejava.javaseassignments.simple;
/*
 * 5)	create a hierarchy

Course
void start()
void end()
override "start()" and "end()" in all the child classes.
MsCit		Basic		Dbda
void orientation()
write a class "CourseDemo" with main and perform functions

perform function should be defined in such a way that it can accept any course and invoke "start()" 
and "end()" functions
also make sure if "Dbda" is passed , its "orientation()" method also should be called.

 */
class Course
{
	public void start()
	{
		
	}
	public void end()
	{
		
	}
}
class Basic extends Course
{

	@Override
	public void start() {
		System.out.println("Basic Course started");
	}

	@Override
	public void end() {
			System.out.println("Basic course ended");
	}
	
}
class Mscit extends Course
{

	@Override
	public void start() {
			System.out.println("MSCIT course started");
	}

	@Override
	public void end() {
		System.out.println("MSCIT course ended");
	}
	
}
class Dbda extends Course
{

	@Override
	public void start() 
	{
		System.out.println("DBDA Course started");
	}
	public void orientation()
	{
		System.out.println("DBDA Orientation done");
	}

	@Override
	public void end() 
	{
		System.out.println("DBDA Course ended ");
	}
	
}
public class Q5 {
		static void perform(Course ref)
		{
			ref.start();
			if(ref instanceof Dbda)
			{
				((Dbda) ref).orientation();
			}
			ref.end();
		}
		
		public static void main(String[] args) 
		{
			perform(new Dbda());
			perform(new Basic());
			perform(new Mscit());
			
		}
}

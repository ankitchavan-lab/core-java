package corejava.interfaces.viva;
abstract class Course
{
	public abstract void on();
	public abstract void off();
	
}
class Mscit extends Course
{

	
	public void on() 
	{
		System.out.println("MSCIT Course started");
		
	}
	public void off() 
	{
	System.out.println("MSCIT Course ended");
		
	}
	
}
class Dbda extends Course
{

	
	public void on() 
	{
		System.out.println("DBDA Course started");
	}
	public void off() 
	{
		System.out.println("DBDA Course Ended");
		
	}
	public void orientation()
	{
		System.out.println("DBDA Orientation done");
	}
	
	
}
class Basic extends Course
{

	
	public void on() 
	{
		System.out.println("Basic Course started");
		
	}

	
	public void off() 
	{
		System.out.println("Basic Course ended");
		
	}
	
}

public class Course_14_4 
{

	public static void main(String[] args) 
	{
		Course crr[]=new Course[3];
		crr[0]=new Basic();
		crr[1]=new Mscit();
		crr[2]=new Dbda();
		
		for(int i=0;i<crr.length;i++)
		{
			crr[i].on();
			if(crr[i] instanceof Dbda)
			{
				Dbda d1=(Dbda)crr[i];//Downcasting
				d1.orientation();
			}
			crr[i].off();
			System.out.println();
		}

	}

}

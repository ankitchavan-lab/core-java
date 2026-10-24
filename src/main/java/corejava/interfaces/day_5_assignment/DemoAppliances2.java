package corejava.interfaces.day_5_assignment;

class Electronic_Appliances2
{
	public void on()
	{
		
	}
	public void off()
	{
		
	}
}
class TV2 extends Electronic_Appliances2
{
	public void on()
	{
		System.out.println("Turn on TV");
	}
	public void off()
	{
		System.out.println("Turn off TV");
	}
}
class Washing_Machine2 extends Electronic_Appliances2
{
	public void on()
	{
		System.out.println("Turn on Washing_Machine");
	}
	public void fillWater()
	{
		System.out.println("Fill water in Washing_Machine");
	}
	public void off()
	{
		System.out.println("Turn off Washing_Machine");
	}
}
public class DemoAppliances2 
{

	public static void main(String[] args) 
	{
		//create an array of "Electronic_Appliance" and store objects of all the child classes inside it. 
		//Now traverse the array  
		//and invoke "on" ,"off" and also "fillwater()" whenever "Washing_Machine" is encountered.
		Electronic_Appliances2 err[]=new Electronic_Appliances2[2];
		err[0]=new TV2();
		err[1]=new Washing_Machine2();	
		
		for(int i=0;i<err.length;i++)
		{
			err[i].on();
			if (err[i] instanceof Washing_Machine2)
			{
				Washing_Machine2 w1=(Washing_Machine2)err[i];
				w1.fillWater();
			}
			err[i].off();
			System.out.println();
		}
		
		
		
	
	}

}

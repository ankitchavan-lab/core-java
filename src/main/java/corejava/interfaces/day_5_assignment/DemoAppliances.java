package corejava.interfaces.day_5_assignment;

import java.sql.Ref;

class Electronic_Appliances
{
	public void on()
	{
		
	}
	public void off()
	{
		
	}
}
class TV extends Electronic_Appliances
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
class Washing_Machine extends Electronic_Appliances
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
public class DemoAppliances 
{

	static void perform(Electronic_Appliances ref)
	{
		ref.on();
		if(ref instanceof Washing_Machine)
		{
			Washing_Machine w1=(Washing_Machine) ref;//DownCasting
			w1.fillWater();
		}	
		ref.off();
	}
	public static void main(String[] args) 
	{
		
		perform(new TV());
		System.out.println();
		perform(new Washing_Machine());
	}

}

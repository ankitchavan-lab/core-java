package corejava.interfaces.inheritance_assignment1;

/*2) create a class "Vehicle", define a method "public void 
start()" in it. From this class derive a class FourWheeler. 
How will u override "start()" method of parent class ?*/
class Vehicle
{
	public void start() 
	{
		System.out.println("In vehicle start");//overrriden method 
	}
}
class FourWheeler extends Vehicle
{
	public void start()
	{	super.start();
		System.out.println("In fourwheeler start");//overriding method
	}
}
public class VehicleQ2 {

	public static void main(String[] args) 
	{
		FourWheeler F1=new FourWheeler();
		F1.start();

	}

}

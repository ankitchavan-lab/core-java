package corejava.javaseassignments.simple;
/*
 * 4)Define an interface “Vechicle” with “start()” function . Now derive  classes like “TwoWheeler”, 
“ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. Define a class “VDemo” 
in which  write  main()  function. In the main function create a reference to Vehicle  class referring to 
any of the sub class. Using this reference, call “start" method.
 */
interface Vehicle
{
	void start();// public and abstract
}
class TwoWheeler implements Vehicle
{

	@Override
	public void start() {
		System.out.println("Start two wheeler ");
		
	}
	
}
class FourWheeler implements Vehicle
{

	@Override
	public void start() {
	System.out.println("Start fourwheeler");
		
	}
	
}
public class Q4 {

	public static void main(String[] args) 
	{
		Vehicle v1=new FourWheeler();
		v1.start();//


	}

}

package corejava.inheritancecomposition.car_engine;
class Engine
{
	void start()
	{
		
	}
}
class BmwEngine extends  Engine
{
	void start()
	{
		System.out.println("BMW engine started");
	}
}
class MarutiEngine extends  Engine
{
	void start()
	{
		System.out.println("Maruti engine started");
	}
	
}
class FordEngine extends Engine
{
	void start()
	{
		System.out.println("Ford engine started");
	}
}
class FourWheeler
{
	void on()
	{
		
	}
}
class Car extends FourWheeler
{
	Engine engine;
	void addEngine(Engine engine)
	{
		this.engine=engine;//black box
	}
	void on()
	{
		System.out.println("Car started");
	}
	void perform()
	{
		this.engine.start();//loose coupling
	}
}
class Truck extends FourWheeler
{	
	Engine engine;
	
	void addEngine(Engine engine)
	{
		this.engine=engine;//back box
	}
	void on()
	{
		System.out.println("Car started");
	}
	void perform()
	{
		this.engine.start();//loose coupling
	}
	
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		Car c1=new Car();
		Engine e1=new BmwEngine();
		c1.addEngine(e1);//loose coupling //white box
		c1.perform();
		c1.on();//Tight coupling//white box

	}

}

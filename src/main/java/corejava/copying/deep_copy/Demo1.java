package corejava.copying.deep_copy;


class Engine
{
	private int temperature;
	public int setTemperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Engine(int temperature) {
		
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Engine [temperature=" + temperature + "]";
	}
	

}
class Car implements Cloneable
{
	private Engine engine;
	private String name;
	public Car(String name) {
		this.name = name;
		this.engine=new Engine(100);
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Object clone()  { //made public was protected in object class
		Car ob=null;
		try {
			ob=(Car)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		//*##*#*##*#*#*# Important #*#**##*
		ob.engine=new Engine(200);
		///Deeply created has-a means new object of has-a provided to cloned object
		return ob;
	}
	@Override
	public String toString() {
		return "Car [" + engine + ", name=" + name + "]";
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Car c1=new Car("Swift");
		System.out.println(c1);
		Car c2=(Car)c1.clone();//Deep Copy 
		//c2.getEngine().setTemperature(5000);
		System.out.println("after modification");
		System.out.println(c1);//changes can be seen in temperature
		System.out.println(c2);
	}

}

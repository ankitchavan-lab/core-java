package corejava.copying.shallow_copy;


class Engine1
{
	private int temperature;
	public int setTemperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Engine1(int temperature) {
		
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Engine [temperature=" + temperature + "]";
	}
	
	
}
class Car1 implements Cloneable
{
	private Engine1 engine;
	private String name;
	public Car1(String name) {
		this.name = name;
		this.engine=new Engine1(100);
	}
	public Engine1 getEngine() {
		return engine;
	}
	public void setEngine(Engine1 engine) {
		this.engine = engine;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Object clone()  {
		Car1 ob=null;
		try {
			ob=(Car1)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return ob;
	}
	@Override
	public String toString() {
		return "Car [" + engine + ", name=" + name + "]";
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Car1 c1=new Car1("Swift");
		System.out.println("Initial Object"+c1);
		Car1 c2=(Car1)c1.clone();//shallow copy 
		c2.getEngine().setTemperature(5000);
		System.out.println("after modification");
		System.out.println("First Object"+c1);
		//changes can be seen in temperature(Initial)
		System.out.println("Modified Object"+c2);
	}

}

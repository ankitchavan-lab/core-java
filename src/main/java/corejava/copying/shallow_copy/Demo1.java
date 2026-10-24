package corejava.copying.shallow_copy;

class Engine
{
	private int temperature;

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
		// TODO Auto-generated method stub
		return "Engine [ "+this.temperature +" ]";
	}
	
}
class Car implements Cloneable
{
	private Engine engine;
	private String name;
	public Car(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine() {
		this.engine=new Engine(100);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine.toString() + ", name=" + name + "]";
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		Car c1=new Car("Swift");
		c1.setEngine();
		try {
			c1.clone();
			// we are not storing it 
			//just observation is how can we access protected clone() method in 
			//main byy overriding it in car class
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		System.out.println(c1);
	}

}

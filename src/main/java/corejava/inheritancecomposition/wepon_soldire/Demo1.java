package corejava.inheritancecomposition.wepon_soldire;
class Person
{
	public void walk()
	{
		
	}
	public void talk()
	{
		
	}
	public void eat()
	{
		
	}
	public void sleep()
	{
		
	}
	
}
interface Weapon
{
	void attack();
}
class Gun implements Weapon
{
	public void attack()
	{
		System.out.println("Attack with gun");
	}
}
class Bomb implements Weapon
{
	public void attack()
	{
		System.out.println("Attack with bomb");
	}
}
class Launcher implements Weapon
{
	public void attack()
	{
		System.out.println("Attack with Launcher");
	}
}
class Soldier extends Person
{
	public Weapon ref;
	
	public Soldier(Weapon ref)
	{
		this.ref=ref;
	}
	public void eat()
	{
		
	}
	public void sleep()
	{
		
	}
	public void walk()
	{
		
	}
	public void talk()
	{
		
	}
	public void perform()
	{
		walk();//tight coupling 
		talk();//white box as these methods are known for soldier
		eat();
		sleep();
		
		ref.attack();//loose coupling//black box as we don't know which weapon can 
		//soldier use 
	}
	
}

public class Demo1 
{

	public static void main(String[] args) 
	{
		Weapon ref=new Bomb();
		Soldier s1=new Soldier(ref);
		s1.perform();

	}

}

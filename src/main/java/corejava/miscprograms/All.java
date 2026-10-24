package corejava.miscprograms;
class person
{
	void walk()
	{
		System.out.println("Walk");
	}
	void talk()
	{
		System.out.println("Talk");
	}
	void eat()
	{
		System.out.println("Eat");
	}
	void sleep()
	{
		System.out.println("Sleep");
	}
}

class Weapon
{
	void attack()
	{
		
	}
}
class Gun extends Weapon
{
	void attack()
	{
		System.out.println("Attack with gun");
	}
	void fillbullets()
	{
		System.out.println("Fill Bullets in Gun");	
	}
}
class Bomb extends Weapon
{
	void attack()
	{
		System.out.println("Attack with Bomb");
	}
}
class Sword extends Weapon
{
	void attack()
	{
		System.out.println("Attack with Sword");
	}
}
class Soldier extends person
{
	Weapon ref;//program to interface// aggregation //has a relation
	//Gun g1=new Gun();//program to implementation //has a relation
	Gun g2;
    Gun g1 = new Gun();
    void setG2(Gun ref)
    {
    	this.g2=ref;//composition 
    }
    
	Soldier(Weapon ref) //upcasting (child object to base ref)
	{
		this.ref=ref;
	}

	void fight()
	{
		g1.attack();
	} 
	void perform()
	{
		// white box reuse   //  tightly coupled relationship
		walk();
		talk();
		eat();
		sleep();
		System.out.println();
		if(ref instanceof Gun)//avoiding class cast exception due to peer class 
		{
			Gun g1=(Gun)ref;//downcasting(Assigning parent ref to child ref)//typecasting
			g1.fillbullets();//calling individual method of child class
		}
		// black box reuse       // loosely coupled relationship
		ref.attack();//Dynamic polymorphism //late binding//polymorphic invocation
	}
}
public class All
{
	public static void main(String args[])
	{
		Soldier s1=new Soldier(new Bomb());
		s1.fight();
		System.out.println();
		s1.perform();
		
	}
}   
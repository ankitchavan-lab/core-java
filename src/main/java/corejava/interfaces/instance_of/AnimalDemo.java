package corejava.interfaces.instance_of;
/*create a hierarchy
Animal
void makeSound()					
override "makeSound()" in all the child classes.

Dog		Cat		Tiger
				void hunting()
write a class "AnimalDemo" with main and perform functions
perform function should be defined in such a way that it can 
accept any animal and invoke "makeSound()" function.
also make sure if "Tiger" is passed , its "hunting()" method 
also should be called.*/
class Animal
{
	public void makeSound()
	{
		
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat makes Meow");
	}
}
class Tiger extends Animal
{
	public void makeSound()
	{
		System.out.println("Tiger roars");
	}
	public void hunting()
	{
		System.out.println("Tiger Hunts");
	}
	
}
public class AnimalDemo 
{

	static void perform(Animal ref)
	{
		ref.makeSound();
		if(ref instanceof Tiger)
		{
			Tiger t1=(Tiger)ref;
			t1.hunting();
		}
	}
	public static void main(String[] args) 
	{
		perform(new Dog());
		System.out.println();
		perform(new Cat());
		System.out.println();
		perform(new Tiger());
		
		
		
	}

}

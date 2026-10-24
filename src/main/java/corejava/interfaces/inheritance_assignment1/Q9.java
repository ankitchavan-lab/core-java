package corejava.interfaces.inheritance_assignment1;

/*9) create interface "Game" , have an abstract method "play()". 
from this interface implements classes like "Cricket" , "FootBall" 
and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface 
reference as parameter.inside "perform()" see to it that any child object 
passed ,its "play()" method should be invoked. Call "perform()" method 
from main function.*/
interface Game
{
	public void play();
}
class Cricket implements Game
{

	@Override
	public void play() 
	{
		System.out.println("In cricket play()");
		
	}
	
}
class FootBall implements Game
{

	@Override
	public void play() 
	{
		System.out.println("In cricket play()");
		
	}
	
}
class Tennis implements Game
{

	@Override
	public void play() 
	{
		System.out.println("In cricket play()");
		
	}
	
}
public class Q9 
{
	static void perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) 
	{
		perform(new Cricket());
		System.out.println();
		perform(new FootBall());
		System.out.println();
		perform(new Tennis());
		

	}

}

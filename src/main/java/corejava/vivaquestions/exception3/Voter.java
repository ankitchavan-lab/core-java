package corejava.vivaquestions.exception3;

public class Voter 
{
	String name;
	int age;
	public Voter(String name, int age) throws InvalidAgeException 
	{
		this.name = name;
		this.age = age;
		if(age<18 || age>60)
		{
			throw new InvalidAgeException("Age not valid for voting");
		}
	}
	@Override
	public String toString() {
		
		return "["+age+"\t"+name+"]";
	}
	
	
	
}

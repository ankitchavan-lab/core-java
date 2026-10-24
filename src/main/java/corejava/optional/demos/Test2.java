package corejava.optional.demos;

import java.util.Optional;

public class Test2 
{
	static String getName()
	{
		return "Ankit";
		//return null;
		//return "Mayur";		
	}
	public static void main(String[] args) 
	{
		Optional<String> op=Optional.ofNullable(getName());
		op.ifPresent(s->System.out.println(getName()));
		System.out.println();
		System.out.println(op.isPresent());//true if getName() returns string
		System.out.println(op.filter(s->s.equalsIgnoreCase("ankit")).isPresent());//true
		System.out.println(op.filter(s->s.equalsIgnoreCase("Mayur")).isPresent());//false
	}
}

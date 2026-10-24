package corejava.miscprograms.immutable_mutable;
//String is Immutable class
//means it has add() method which gives new object every time 
//it doesn't have setter() method 

class Immutable
{
	private int num;

	public Immutable()
	{
		
	}
	public Immutable(int num)
	{
		this.num=num;
	}
	public int getNum() 
	{
		return num;
	}
	public String toString()
	{
		return "["+num+"]";
	}
	public Immutable add(int num)
	{
		return new Immutable(this.num+num);
	}
}
public class ImmutableDemo
{

	public static void main(String[] args)
	{
		Immutable i1=new Immutable(10);
		
		Immutable i2=i1.add(30);
		System.out.println(i1.getNum());
		System.out.println(i2.getNum());
	}
}

package corejava.miscprograms.immutable_mutable;
//String Builder class is mutable 
//when we invoke add() method on ref of class it will
//modify previous object content
class Mutable
{
	int a;

	public Mutable(int a) 
	{
		this.a = a;
	}

	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}
	public Mutable add(int num)
	{
		 a+=num;
		 return this;
	}
	
}
public class MutableDemo 
{

	public static void main(String[] args) 
	{
		Mutable m1=new Mutable(10);
		m1.add(20).add(40).add(80);
		System.out.println(m1.getA());
	}

}

package corejava.generics.lecture_wale;

class Generics<T>
{
	private T first;

	public T getFirst() 
	{
		return first;
	}

	public void setFirst(T first) 
	{
		this.first = first; 
	}
}

public class Demo1 
{

	public static void main(String[] args) 
	{
		Generics<Integer> i=new Generics<Integer>();
		i.setFirst(100);//new Integer(100)
		System.out.println(i.getFirst());
		System.out.println();
		
		Generics<String> s=new Generics<String>();
		s.setFirst("Hello");
		System.out.println(s.getFirst());//first.intValue();
		
		

	}

}

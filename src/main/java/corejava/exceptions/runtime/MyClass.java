package corejava.exceptions.runtime;

public class MyClass 
{
	void disp(int a)
	{
		if(a<=0)
			throw new RuntimeException();
	}
	
	public static void main(String[] args) 
	{
		MyClass m1=new MyClass();
		m1.disp(6);
		System.out.println(m1.getClass().getClassLoader());
		
	}

}

package corejava.miscprograms.wrapper_classes;

public class Demo1 
{

	public static void main(String[] args) 
	{
		int num=100;
		int num1=200;
		Integer ob=new Integer(num);
		System.out.println(ob);//ob.intValue() 
		System.out.println(ob.intValue());
		Integer ob1=num1;// P to W Auto-boxing
	//	Integer ob1=new Integer(num1)
		int temp=ob1;// W to P Un-boxing
	//	int temp=ob1.intValue()	
		
	}

}

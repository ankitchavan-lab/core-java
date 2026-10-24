package corejava.miscprograms.varargs;

public class Demo1 
{
	void disp1(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition: "+c);
		
	}
	void disp2(int...k)
	{
		for(int i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" ");
		
			
		}	
		System.out.println();
		for(int k1:k)  // foreach
		{
			System.out.print(k1+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		d.disp1(20,30);
		System.out.println();
		d.disp2(10,20);
		System.out.println();
		d.disp2(34,36,29,90,70,70,90,98,78,67);

	}

}

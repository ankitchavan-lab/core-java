package corejava.miscprograms.varargs;

public class Subtraction 
{
	public static void sub(int...k)
    {
		int A=0;
    	for(int i=0 ; i<k.length-1 ;i++)
    	{	
    		
    		if(i==0)
    		{
    			A=k[i]-k[i+1];
    		}
    		else
    		{
    			A=A-k[i+1];
    		}
    		
    	}
    	System.out.println(A);
    	
    }
	
	public static void main(String[] args) 
	{
	    sub(500,200,100);		

	}

}

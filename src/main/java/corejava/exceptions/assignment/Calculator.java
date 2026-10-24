package corejava.exceptions.assignment;

public class Calculator 
{
	public int caldouble(int a)throws MyArithException
	{
		if(a==0)
		{
			throw new MyArithException("Zero not allowed");
		}
		if(a<0)
		{
			throw new MyArithException("Negative not allowed");
		}
		return a+a;
	}
}


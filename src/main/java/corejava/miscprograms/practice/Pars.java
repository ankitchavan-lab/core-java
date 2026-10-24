package corejava.miscprograms.practice;

public class Pars 
{
	
public String toString()//testing to string
{
	return "HI";
}
	public static void main(String[] args) 
	{
		String str="125";
		System.out.println(str);//toString() is overriden in String class 
		int temp=Integer.parseInt(str);//gives o/p  by converting string into digits
		temp+=70;
		System.out.println(temp);
		Pars p1=new Pars();
		System.out.println(p1);
		
	}

}

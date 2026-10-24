package corejava.methodreference.class_work;
interface NN
{
	String arg(String name);
}
class Myclass
{
	static String disp(String name)
	{
		return "Hello "+name;
	}
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		Myclass m=new Myclass();
		//lambda
		System.out.println("Using lambda");
		NN n=(String name)->{return m.disp(name);};
		//invoking implemented method which has argument
		System.out.println(n.arg("Ankit\n"));
		//now using method ref
		NN n2=Myclass::disp;
		System.out.println("Using Method Ref\n"+n2.arg("Neha"));
		
	}

}

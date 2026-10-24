package corejava.methodreference.class_work;
//var_args using method ref and lambda
interface p
{
	void vararg(int p);
}
class Bab
{
	void disp(int...l)
	{
		for(int temp:l)
		{
			System.out.println("In class disp:"+l);
		}
		
	}
}
	
public class Demo7 {

	public static void main(String[] args) {
		Bab n=new Bab();
		p p1=(a)->{n.disp(a,23,45,67);};
		p1.vararg(22);
		p k1=n::disp;
		n.disp(23,56,89);
	}

}

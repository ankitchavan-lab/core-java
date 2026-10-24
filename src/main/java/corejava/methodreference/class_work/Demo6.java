package corejava.methodreference.class_work;
// print using method ref
interface l
{
	void disp(int b,int k);
}

public class Demo6 {

	public static void main(String[] args) 
	{
//		//using lambda
//		System.out.println("Using lambda");
//		l i=(a)->{System.out.println(a+"\n");};
//		i.disp(300);
//		
//		//using S.O.P
//		//we can print single para using method ref
//		System.out.println("Using Method ref");
//		l o=System.out::println;
//		o.disp(300);
		l i=(a,b)->{System.out.println(a+" "+b+"\n");};
		i.disp(200, 300);
		//using method ref we cant as prinln does not take such args
		//l m=System.out::println;
		
		

	}

}

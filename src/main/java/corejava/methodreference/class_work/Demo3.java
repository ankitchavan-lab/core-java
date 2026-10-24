package corejava.methodreference.class_work;

interface New {
	void inter(int a);
}

class oneTo {
	void disp(int a) {
		System.out.println("Passed value to the abstract method is \n" + a + "\n");

	}

}

public class Demo3 {

	public static void main(String[] args) {
		oneTo o = new oneTo();
		System.out.println("using lambda");
		// using lamba
		// doesn't need to specify datatype
		New n = (a) -> {
			o.disp(a);
		};
		n.inter(200);
		// using method ref
		// the value pass to the abstract method will be pass to the disp() internally
		System.out.println("Using Method Ref");
		New n2 = o::disp;
		n2.inter(300);

		System.out.println("************************************************************");
		System.out.println("Now we can manupulate ta value in lambda where in method ref we can't\n");
		New j = (a) -> {
			o.disp(a + 2000);
		};
		// manupulation
		System.out.println("Manipulated value");
		j.inter(20);

	}

}

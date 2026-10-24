package corejava.methodreference.class_work;

// constructor using method ref
interface Cons {
	void myMethod();
}

interface ArgCons {
	void myMethods(int a);
}

class Test {
	int a;

	public Test() {
		System.out.println("In constructor no arg");
	}

	public Test(int a) {
		System.out.println("Intitalized value is: " + a);
		// this.a = a;// we can see this is not mandatory
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// using lambda no arg constructor
		System.out.println("Lambda");
		Cons ref = () -> {
			new Test();
		};
		ref.myMethod();
		// using method ref no args
		System.out.println("Method REf");
		Cons ref2 = Test::new;

		System.out.println("*************************************\nParameterized Constructor");
		System.out.println("Lambada");
		ArgCons r = (a) -> {
			new Test(a);
		};
		r.myMethods(200);
		System.out.println("Using Method ref");
		ArgCons h = Test::new;
		h.myMethods(200);

	}

}

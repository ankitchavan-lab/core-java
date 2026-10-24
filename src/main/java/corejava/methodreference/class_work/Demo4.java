package corejava.methodreference.class_work;

interface g {
	void method(int a);
}

class Dem {
	void disp(int k) {
		System.out.println("Value passed to the abstract method is " + k);
	}

	void disp2(int g) {
		System.out.println("Value passed to the abstract method is " + g);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// lambda can write no of methods
		Dem d = new Dem();
		g j = (a) -> {
			d.disp(a);
			d.disp2(a + 300);
		};
		j.method(900);
		// using method ref
		System.out.println("Using method ref");
		g l = d::disp;
		g l2 = d::disp2;
		l.method(300);
		l2.method(900);

	}

}

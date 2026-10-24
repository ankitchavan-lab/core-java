package corejava.lambda.class_work;

interface G {
	void disp();
}

class Demo {
	int n = 2018;
	G ref = () -> {
		System.out.println("In G disp");
	};

}

public class Test7 {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.n);
		d.ref.disp();
		System.out.println("Implementation: " + d.ref.getClass().getName());

	}

}

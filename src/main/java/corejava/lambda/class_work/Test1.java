package corejava.lambda.class_work;

interface B {
	String disp(String name);// contract
}

class My {
	B getB() { // anymonas class// Local Inner Class
		B ref = new B() {
			@Override
			public String disp(String name) {
				return "Hello " + name;
			}
		};
		return ref;
	}
}

public class Test1 {

	public static void main(String[] args) {
		My m = new My();
		B ref = m.getB();
		System.out.println(ref.disp("Ankit"));
		System.out.println(ref.getClass().getName());
	}

}

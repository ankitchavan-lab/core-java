package corejava.lambda.class_work;

interface D {
	String disp(String name);
}
class MyClass {
}

public class Test2 {

	public static void main(String[] args) {
		// lambda
		D d = (String name) -> {
			return "Hello " + name;
		};
		System.out.println(d.disp("Ankit"));
		System.out.println(d.getClass().getSimpleName());

		// second implementtion of interface D using lambda
		System.out.println();
		System.out.println("One More");
		D c = (String name) -> {
			return "Welcome to " + name;
		};
		System.out.println(c.disp("Gaurdians"));
		System.out.println(c.getClass().getSimpleName());

	}

}

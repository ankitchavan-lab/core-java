package corejava.lambda.class_work;

interface L {
	static void disp() {

		System.out.println("In inteface disp");
	}

	int opr(int num);
}

public class Test3 {

	static void addition(L ref) {
		System.out.println("Multilple of 2 of the given number is: " + ref.opr(5));
		System.out.println(ref.getClass().getName());
	}

	public static void main(String[] args) {
		L l = (int num) -> {
			return num * num;
		};
		System.out.println("Square of the number is: " + l.opr(23));
		System.out.println("Name of the implementation is: " + l.getClass().getName());

		System.out.println();
		System.out.println("One more square");
		System.out.println("Square of the number is: " + l.opr(20));
		System.out.println("*********Invoking Static method*********");
		L.disp();
		System.out.println("\n\n****************************************");
		System.out.println("Passing lambda as an argument");
		// passing as an argument
		addition((int num) -> {
			return num + num;
		});

	}

}

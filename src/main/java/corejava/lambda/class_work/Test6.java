package corejava.lambda.class_work;

interface emp {
	void disp();
}

interface emp1 {
	void disp(int a, int b);
}

interface emp2 {
	int disp();
}

public class Test6 {

	public static void main(String[] args) {
		emp ref = () -> System.out.println("In emp disp");
		ref.disp();
		emp1 ref2 = (int a, int b) -> System.out.println("Entered numbers are: " + a + " and  " + b);
		ref2.disp(21, 22);
		emp2 ref3 = () -> 200000;
		System.out.println("its returning: " + ref3.disp());
	}
}

package corejava.nestedclasses.class_practice;

class Outer2 {
	static int num = 10;
	final int kk = 20;
	private int op = 30;

	private void disp() {
		System.out.println("In outer disp");

	}
	static class inner5 {
		void disp1() {
			System.out.println("In Static nested class");
			System.out.println("Static Members of Outer class " + num);
			// we can access only static members of Outer class
		}
	}

}

public class Static_Inner_Class {

	public static void main(String[] args) {
		Outer2.inner5 i = new Outer2.inner5();
		i.disp1();

	}

}

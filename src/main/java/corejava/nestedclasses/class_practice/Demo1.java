package corejava.nestedclasses.class_practice;

//Inner Class

class Outer {
	private int num = 10;

	private void disp() {
		System.out.println("In Outer disp " + num);
	}

	Outer() {
		System.out.println("In outer class def constructor");
		// inner ref=new inner();
		// ref.disp2();
	}

	class inner {
		private int num1 = 10;
		final int num2 = 20;
		static final int num3 = 30;
		
		void disp2() {

			disp();
			System.out.println("In inner class disp");
			System.out.println("Private member of outer class " + num);
		}

	}

//	class inner1 {
//		private int num1 = 10;
//		final int num2 = 20;
//		static final int num3 = 30;
//
//		void disp2() {
//
//			disp();
//
//			System.out.println("In inner1 class disp");
//		}
//
//	}

}

public class Demo1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		// o.disp();
		Outer.inner i = o.new inner();
		i.disp2();
		System.out.println();
	//	Outer.inner1 i1 = o.new inner1();
		//i1.disp2();

	}
}
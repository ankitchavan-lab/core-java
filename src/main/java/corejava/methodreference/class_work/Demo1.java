package corejava.methodreference.class_work;

interface AB {
	void om();
}

class Sample {
	void disp() {
		System.out.println("In Sample");
	}

}

public class Demo1 {
	// Lambda and method reference comparison

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println("Using Lambda");
		AB ref = () -> {
			s.disp();
		};// lamda to invoke existing method
			// so we can use method reference
		ref.om();// invoking Om() from interface
		System.out.println(ref.getClass().getName());
		System.out.println();

		// so we have om() implementation we have only one method so we should use method
		// refrence for compaction
		System.out.println("Using Method Reference");
		AB ref3 = s::disp; // using method reference which will invoke implementation of interface which
							// invokes only // disp() method from Sample Class
		ref3.om(); 
		System.out.println(ref3.getClass().getName()); // it will consider as lambda internally
	}

}

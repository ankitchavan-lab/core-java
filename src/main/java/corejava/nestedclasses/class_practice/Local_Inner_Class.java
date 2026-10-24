package corejava.nestedclasses.class_practice;

interface MyInterface {
	void disp();
}

class MyClass {
	public MyInterface getMyInterface() {
		
		  return new MyInterface() { 
			  //when we open braces here will consider as new
		  //class //Definition //Instantiation //return //this all known as Compactness
		  
		  @Override public void disp() { System.out.println("In new Implementation");
		  
		  }//ref is anonymous
		  
		  };
		 

		/// Alternate

//		MyInterface ref = new MyInterface() {
//
//			@Override
//			public void disp() {
//				System.out.println("In Implemented Disp");
//
//			}
//
//		};
//		return ref;// at this time ref is not anonymous
	}
}

public class Local_Inner_Class {

	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyInterface ref2 = m1.getMyInterface();
		ref2.disp();
	}

}

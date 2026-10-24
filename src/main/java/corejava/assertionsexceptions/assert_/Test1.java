package corejava.assertionsexceptions.assert_;

public class Test1 {

	public static void main(String[] args) {
		int a=10;
		
		assert(a<=0);//by default disabled //boolean expression is needed 
		System.out.println("Number is checked");
		assert(a>20):"Number is not upto mark";
		System.out.println("Test 2 is done");//we can enable them by "-ea"

	}

}

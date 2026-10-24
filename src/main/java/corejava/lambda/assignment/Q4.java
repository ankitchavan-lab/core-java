package corejava.lambda.assignment;

import org.omg.Messaging.SyncScopeHelper;

/*
 * 4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and 
display its result.
 */
interface Calculator
{
	int multiply(int a,int b);
}
public class Q4 {

	public static void main(String[] args) {
		Calculator ref=(int a,int b)->{System.out.print("Result is: ");return a*b;};
		System.out.println(ref.multiply(20,5));
		
		
		
	}

}

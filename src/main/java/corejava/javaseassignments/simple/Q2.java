package corejava.javaseassignments.simple;
/*
 * 2)	Define 3 classes A , B and C
in all these classes create static and non-static variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the 
	members of A ,B  and C.

 */
class A
{
	private static int a;
	private int b=0;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		A.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
class B
{
	private static int g=0;
	private int e;
	public static int getG() {
		return g;
	}
	public static void setG(int g) {
		B.g = g;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	
}
class C
{
	private static int h=0;
	private int f;
	public static int getH() {
		return h;
	}
	public static void setH(int h) {
		C.h = h;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		A a=new A();
		a.setB(1);
		A.setA(100);
		System.out.println(A.getA());
	}

}

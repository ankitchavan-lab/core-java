package corejava.strings.string1;

public class xgcj {

	public static void main(String[] args) {

		/// java does'nt support operator overloading

		String s1 = new String("Ankit");
		String s2 = "Ankit";

		System.out.println(s1 == s2); // false --->

		System.out.println(s1.equals(s2)); // true

		int a = 10;
		int b = 100;

		System.out.println(a == b);
	}

}

package corejava.fundamentals;

public class MethodsDemo {

	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 8;

		System.out.println("Sum: " + add(firstNumber, secondNumber));
		System.out.println("Maximum: " + maximum(firstNumber, secondNumber));
	}

	private static int add(int first, int second) {
		return first + second;
	}

	private static int maximum(int first, int second) {
		return first > second ? first : second;
	}
}

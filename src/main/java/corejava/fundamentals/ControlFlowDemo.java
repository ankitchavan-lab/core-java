package corejava.fundamentals;

public class ControlFlowDemo {

	public static void main(String[] args) {
		int score = 82;

		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else {
			System.out.println("Grade: C or below");
		}

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("Excellent");
			break;
		case 8:
			System.out.println("Good");
			break;
		default:
			System.out.println("Keep practicing");
		}

		for (int number = 1; number <= 5; number++) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println("Odd number: " + number);
		}
	}
}

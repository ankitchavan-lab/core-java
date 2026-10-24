package corejava.fundamentals;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] scores = { 78, 92, 85 };
		int total = 0;

		for (int score : scores) {
			total += score;
		}

		int[][] seats = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};

		System.out.println("Scores: " + Arrays.toString(scores));
		System.out.println("Average: " + (double) total / scores.length);
		System.out.println("First row of seats: " + Arrays.toString(seats[0]));
	}
}

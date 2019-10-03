/**
 * 
 */
package lt.vtmc.Pd9;

import java.util.Scanner;

/**
 * @author vilius
 *
 */
public class JavaPd9 {
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checksTriangle();
		equation();
		miniGame();
		x3For();
		x3While();

	}

	private static void x3While() { // 5. Generates answers for y = 3x equation for x from 0 to 10
		int x = 0;
		while (x != 11) {
			int y = 3 * x;
			System.out.println("If x = " + x + " then y = " + y);
			x++;
		}
	}

	private static void x3For() { // 4. Generates answers for y = 3x equation for x from 0 to 10
		for (int x = 0; x < 11; x++) {
			int y = 3 * x;
			System.out.println("If x = " + x + " then y = " + y);
		}
	}

	private static void miniGame() { // 3. Lets the user guess a random number between 1-100 n times until he gets it
										// right and prints how many guesses it took.
		double random = Math.random();
		int number = (int) (random * 100); // for testing delete a 0 from 100
		System.out.println(number);
		System.out.println("Try to guess a number between 1 and 100");
		System.out.println("Enter your number");
		int numberOfTries = 0;
		int correct = 0;
		start: while (correct != 1) {
			int numberIn = input.nextInt();
			if (numberIn == number) {
				System.out.println("Congratulations! You guessed correct!!! It took you " + numberOfTries + " times");
				correct = 1;
			} else if (numberIn != number) {
				System.out.println("Sorry it is not " + numberIn + " :(. Please try again.");
				numberOfTries++;
				continue start;
			}
		}
	}

	private static void equation() { // 2. calculates ax^2 + bx + c
		System.out.println("Hello please give me a");
		double a = input.nextDouble();
		System.out.println("Hello please give me b");
		double b = input.nextDouble();
		System.out.println("Hello please give me c");
		double c = input.nextDouble();
		double discriminant = (b * b) - (4 * a * c);
		if (a != 0 & b != 0 & c != 0) {
			if (discriminant == 0) {
				double result = 0 - (b / (2 * a));
				System.out.println("The answer is :" + result);
			} else if (discriminant > 0) {
				double result = (((0 - b) + (Math.pow(discriminant, -2)) / (2 * a)));
				double result2 = (((0 - b) - (Math.pow(discriminant, -2)) / (2 * a))); // cant round correctly!!!!????
				System.out.println("The answer is :" + result + " and " + result2);
			} else if (discriminant < 0) {
				System.out.println("Sorry there are no real answers");
			}
		} else if (a == 0 & b != 0 & c != 0) {
			System.out.println("Equation is bx + c");
			System.out.println("If you want me to calculate you the answer please give me the x");
			double x = input.nextDouble();
			double result = b * x - c;
			System.out.println("The answer is :" + result);
		} else if (a != 0 & b == 0 & c != 0) {
			System.out.println("Equation is ax^2 + c");
			System.out.println("If you want me to calculate you the answer please give me the x");
			double x = input.nextDouble();
			double result = (a * a * x) + c;
			System.out.println("The answer is :" + result);
		} else if (a != 0 & b != 0 & c == 0) {
			System.out.println("Equation is ax^2 + bx");
			System.out.println("If you want me to calculate you the answer please give me the x");
			double x = input.nextDouble();
			double result = (a * a * x) + (b * x);
			System.out.println("The answer is :" + result);
		}
	}

	private static void checksTriangle() { // 1. will check if the triangle has a 90 degrees angle

		System.out.println("Please enter triangle side dimension a");
		double a = input.nextDouble();
		System.out.println("Please enter triangle side dimension b");
		double b = input.nextDouble();
		System.out.println("Please enter triangle side dimension c");
		double c = input.nextDouble();
		if (a <= 0 | b <= 0 | c <= 0) {
			System.out.println("Sides can't have a value like that. Please try again!");
			checksTriangle();
		} else {
			if (a * a + b * b == c * c | a * a + c * c == b * b | c * c + b * b == a * a) {
				System.out.println("Yay! Your triangle has 90 degree angle");
			} else {
				System.out.println("Sorry. This triangle doesn't have a 90 degree angle");
			}
		}

	}
}

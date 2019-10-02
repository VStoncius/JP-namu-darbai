/**
 * 
 */
package lt.vtmc.pd7;

import java.util.Scanner;

/**
 * Calculator app with variuos features
 * version: 0.1 beta 
 * @author vilius
 *
 */
public class Skaiciuotuvas {
	static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		startUp();

	}

	private static void startUp() { // handles selection of functions
		System.out.println("Welcome! What would you like to do today?");
		System.out.println("1. Basic operations:");
		System.out.println("2. Operations with Exponents:");
		System.out.println("3. Trigonometry:");
		System.out.println("4. Percentage:");
		System.out.println("5. Remainder:");
		System.out.println("0. Exit the calculator:");
		System.out.println("Please select a number:");

		int input = scan.nextInt();
		if (input == 1) {
			basicOperations();
		} else if (input == 2) {
			exponents();
		} else if (input == 3) {
			trigonometry();
		} else if (input == 4) {
			percentage();
		} else if (input == 5) {
			remainder();
		} else if (input == 0) {
			System.exit(0);
		} else {
			tryAgain();
		}
	}

	private static void tryAgain() { // triggers on bad input
		System.out.println(
				"I am sorry but I did not understand the answer. Which operations would you like to do today?");
		System.out.println("1. Basic operations:");
		System.out.println("2. Operations with Exponents:");
		System.out.println("3. Trigonometry:");
		System.out.println("4. Percentages:");
		System.out.println("5. Remainder:");
		System.out.println("0. Exit the calculator:");
		System.out.println("Please select a number:");

		int input = scan.nextInt();
		if (input == 1) {
			basicOperations();
		} else if (input == 2) {
			exponents();
		} else if (input == 3) {
			trigonometry();
		} else if (input == 4) {
			percentage();
		} else if (input == 5) {
			remainder();
		} else if (input == 0) {
			System.exit(0);
		} else {
			tryAgain();
		}
	}

	private static void remainder() { // calculates remained
		System.out.println("Please enter the number you want to calculate the remainder of:");
		int input = scan.nextInt();
		System.out.println("Please enter the you want to divide by: ");
		int input2 = scan.nextInt();
		int result = (input % input2);
		System.out.println("Here is your answer!: " + result);

	}

	private static void percentage() { // calculates percentage
		System.out.println("Please enter the number you want to calculate the percentage:");
		double input = scan.nextInt();
		System.out.println("Please enter the you want to calculate the percentage of: ");
		double input2 = scan.nextInt();
		double result = (input / input2) * 100;
		System.out.println("Here is your answer!: " + result + "%");

	}

	private static void trigonometry() { // handles selection of trigonometry functions
		System.out.println("What exactly would you like to calculate?");
		System.out.println("1. Sinus");
		System.out.println("2. Cosinus");
		System.out.println("3. Tangen");
		System.out.println("4. Cotangen");
		System.out.println("0. Exit the calculator:");
		System.out.println("Please select a number:");

		int input = scan.nextInt();
		if (input == 1) {
			sinus();
		} else if (input == 2) {
			cosinus();
		} else if (input == 3) {
			tangent();
		} else if (input == 4) {
			cotangent();
		} else if (input == 0) {
			System.exit(0);
		} else {
			trigonometry();
		}

	}

	private static void cotangent() { // calculates ctg
		System.out.println("Please enter the number you want to calculate cotangent for: ");
		double input = scan.nextInt();
		double result = 1 / Math.tan(input);
		System.out.println("Here is your answer!: " + result);
		trigonometry();

	}

	private static void tangent() { // calculates tg
		System.out.println("Please enter the number you want to calculate tangent for: ");
		double input = scan.nextInt();
		double result = Math.tan(input);
		System.out.println("Here is your answer!: " + result);
		trigonometry();

	}

	private static void cosinus() { // calculates cos
		System.out.println("Please enter the number you want to calculate cosinus for: ");
		double input = scan.nextInt();
		double result = Math.cos(input);
		System.out.println("Here is your answer!: " + result);
		trigonometry();

	}

	private static void sinus() { // calculates sin
		System.out.println("Please enter the number you want to calculate sinus for: ");
		double input = scan.nextInt();
		double result = Math.sin(input);
		System.out.println("Here is your answer!: " + result);
		trigonometry();

	}

	private static void exponents() { // handles selection of ^x functions

		System.out.println("What exactly would you like to do?");
		System.out.println("1. Get a squared number");
		System.out.println("2. Calculate a number to the power of x");
		System.out.println("3. Get a square root of a number");
		System.out.println("0. Exit the calculator:");
		System.out.println("Please select a number:");

		int input = scan.nextInt();
		if (input == 3) {
			sqRoot();
		} else if (input == 2) {
			powerOf();
		} else if (input == 1) {
			squared();
		} else if (input == 0) {
			System.exit(0);
		} else {
			exponents();
		}

	}

	private static void squared() { // puts number to ^2
		System.out.println("Please enter the number you want to multiply by itself: ");
		double input = scan.nextInt();
		double result = input * input;
		System.out.println("Here is your answer!: " + result);
		exponents();

	}

	private static void powerOf() { // puts number to ^x
		System.out.println("Please enter the number you want to calculate to the power of x: ");
		double input = scan.nextInt();
		System.out.println("Please enter the number of ^x: ");
		double input2 = scan.nextInt();
		double result = Math.pow(input, input2);
		System.out.println("Here is your answer!: " + result);
		exponents();

	}

	private static void sqRoot() { // calculates sqroot
		System.out.println("Please enter the number you want to square root for: ");
		double input = scan.nextInt();
		double result = Math.sqrt(input);
		System.out.println("Here is your answer!: " + result);
		exponents();

	}

	private static void basicOperations() { // handles selection of basic operations
		System.out.println("What basic operation are we doing now?");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. Exit the calculator:");
		System.out.println("Please select a number:");

		int input = scan.nextInt();
		if (input == 1) {
			addition();
		} else if (input == 2) {
			substraction();
		} else if (input == 3) {
			multiplication();
		} else if (input == 4) {
			division();
		} else if (input == 0) {
			System.exit(0);
		} else {
			basicOperations();
		}
	}

	private static void division() { // divides 2 numbers
		System.out.println("Please enter the number you want to divide: ");
		double input = scan.nextInt();
		System.out.println("Please enter the number you want to divide by: ");
		double input2 = scan.nextInt();
		double result = input / input2;
		System.out.println("Here is your answer!: " + result);
		basicOperations();
	}

	private static void multiplication() { // multiplies 2 numbers
		System.out.println("Please enter the number you want to multiply: ");
		double input = scan.nextInt();
		System.out.println("Please enter the number you want to multiply by: ");
		double input2 = scan.nextInt();
		double result = input * input2;
		System.out.println("Here is your answer!: " + result);
		basicOperations();
	}

	private static void substraction() { // sucstracts a from b
		System.out.println("Please enter the number you want to substract from: ");
		double input = scan.nextInt();
		System.out.println("Please enter the number you want to substract: ");
		double input2 = scan.nextInt();
		double result = input - input2;
		System.out.println("Here is your answer!: " + result);
		basicOperations();

	}

	private static void addition() { // adds a to b
		System.out.println("Please enter the number you want to add: ");
		double input = scan.nextInt();
		System.out.println("Please enter the number you want to add to: ");
		double input2 = scan.nextInt();
		double result = input + input2;
		System.out.println("Here is your answer!: " + result);
		basicOperations();

	}

}

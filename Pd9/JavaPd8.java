/**
 * 
 */
package lt.vtmc.Pd8;

import java.util.Scanner;

/**
 * @author vilius
 *
 *         demonstrates the functionality of if, else, switch, break, continue
 *         operators 6. sample program has several methods
 */
public class JavaPd8 {
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		tryIf();
		tryFor();
		continues();
		labeled();
		reader();
	}

	private static void reader() { //determines data type
		System.out.println("Show me what you've got!");
		String value = input.next();
		try {
			int number = Integer.parseInt(value);
			System.out.println("Your number is integer: " + number);
		} catch (Exception NumberFormatException) {
			try {
				double number = Double.parseDouble(value);
				System.out.println("Your number is double: " + number);
			} catch (Exception NumberFormatExceptionStr) {
				System.out.println("This is just a simple string: " + value);
			} finally {
			}
		}
	}

	private static void labeled() { // 4. shows labeled continue and break
		int j = 0;
		start: for (int i = 0; i < 20; i++) {
			if (i == 8) {
				continue start;
			}
			System.out.println(i);
			if (i == 15) {
				break start;
			}
		}
		System.out.println("This is out of the loop");

	}

	private static int continues() { // 3. demonstrates continue, break and return

		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				continue;
			} else if (i == 17) {
				break;
			}
			System.out.println(i);
		}
		int x = 7 + 3;
		return x; // 5. returns a value
	}

	private static void tryFor() { // 2. demonstrates for
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		int x = 0; // demonstrates while
		while (x != 5) {
			System.out.println("While skaicius " + x);
			x++;
		}
		x = 0;
		do { // demonstrates do-while
			System.out.println("Do-While skaicius " + x);
			x++;
		} while (x != 5);

	}

	private static void tryIf() { // 1. demonstrates if, if else and switch
		double number = Math.random() * 10;
		if (number > 0) { // demonstrates if-then
			System.out.println("Your number = " + number);
		}
		if (number < 5) { // demonstrates if-then-else
			System.out.println("Number is less than 5");
		} else if (number > 5) {
			System.out.println("Number is more than 5");
		}
		System.out.println("Give me a number 1-5");
		int selection = input.nextInt();
		switch (selection) { // 8. demonstrates switch
		case 1:
			selection = 1;
			System.out.println("Number 1");
			break;
		case 2:
			selection = 2;
			System.out.println("Number 2");
			break;
		case 3:
			selection = 3;
			System.out.println("Number 3");
			break;
		case 4:
			selection = 4;
			System.out.println("Number 4");
			break;
		case 5:
			selection = 5;
			System.out.println("Number 5");
			break;
		}

	}

}

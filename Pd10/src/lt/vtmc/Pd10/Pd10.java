/**
 * 
 */
package lt.vtmc.Pd10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author vilius
 *
 */
public class Pd10 {
	static Random number = new Random(1 - 9);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		randomArray();
		fibonachi();
		item();
		strArrays();
		longArray();
		

	}

	private static void longArray() { // 4. creates long type array of 50000 characters and sorts it
		long [] longArray = new long [50000];
		for (int i = 0; i < 50000; i++) {
			longArray[i] = number.nextInt(100);
		}
		Arrays.sort(longArray);
		System.out.println(Arrays.toString(longArray));
		
	}

	private static void strArrays() { //3. String type array is sorted and printed out to console
		String [] strArray = {"Vilius", "Ausra", "Laura", "Giedrius", "Laimis", "Saulius", "Zita", "Vaidas", "Mantas", "Tomas"};
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
	}

	private static void item() { // 2. Creates 2 arrays each having 20 random values between 1-100 and calculates the average of the maximum values
		int[] array = new int[20];
		int[] array2 = new int[20];
		for (int i = 0; i < 20; i++) {
			array[i] = number.nextInt(100);
		}
		Arrays.sort(array);
		for (int i = 0; i < 20; i++) {
			array2[i] = number.nextInt(100);
		}
		Arrays.sort(array2);
		System.out.println((array[19] + array2[19])/2);

	}
	private static void fibonachi() { //2. Calculates fibonachi sequence number at 120
		int x = 0;
		int y = 1;
		int z = 0;
		for (int i = 2; i < 121; i++) {
			z = x + y;
			x = y;
			y = z;
		}
		System.out.println(z);
		System.out.println();
	}

	private static void randomArray() { // 1. creates an Array of 100 random values between 0 and 9 and sorts them from lowest to highest
		
		int [] array = new int [100];
		for (int i = 0; i < 100; i++) {
			array [i] = number.nextInt(9);
			
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
}

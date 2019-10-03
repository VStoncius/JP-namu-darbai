/**
 * 
 */
package lt.vtmc.passGen;


import java.util.Arrays;
import java.util.Random;

/**
 * @author vilius
 *
 */
public class PassGenerator {
	static StringBuilder builder = new StringBuilder();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		passGen();
				

	}

	

	public static  void passGen() { // creates an array of 3000000 random passwords
		String[] passwords = new String[3000000];
		char[] seed = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+=/?.>,<"
				.toCharArray();
		System.out.println(Arrays.toString(seed));
		int index = seed.length - 1;
		Random number = new Random(index);
		for (int i = 0; i < 3000000; i++) { // generates the passwords
			builder.delete(0, 8);
			for (int j = 0; j < 8; j++) {
				int randomizer = number.nextInt(index);
				char character = seed[randomizer];
				builder.append(character);
				if (j == 7) {
					String pass = builder.toString();
					passwords [i] = pass;
				}
			}
			
		}
		passCheck(passwords);
	}
	
	public static void passCheck(String[] passwords) { //checks adjacent array elements if they are duplicates after sorting them out
		Arrays.sort(passwords);
		int index = passwords.length - 1;
		for (int i = 0; i < index; i++) {
			if (passwords[i].equals(passwords[i+1]) ) {
				System.out.println("Duplicates found!!!!");
				System.out.println("Restarting password generator");
				passGen();
			}
			else {
				
			}
		}
		System.out.println("No duplicates found! Congtaz!");	
	}

}

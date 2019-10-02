
package lt.vtmc.extra;

import java.util.Arrays;

/**
 * @author vilius
 *
 */
public class Matrica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
			//for (int i = 0; i < 10; i++) {
			//	System.out.println("0, 0, 0, 0, 0, 0, 0, 0, 0, 0");
			//}
			int Array1 [] = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			for (int i = 0; i < 10; i++) {
				System.out.println(Arrays.toString(Array1));
				Array1 [i] = 0;
				if (i<9) {
				Array1 [i+1] = 1;
				}
			}
		}

	}
}
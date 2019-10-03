/**
 * 
 */
package lt.vtmc.Pd10;

/**
 * @author vilius
 *
 */
public class Pd10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFor();
	}

	private static void checkFor() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.print(i + " ");
//		}

//		for(;;) {
//			System.out.println("Infinity");
//		}
//		System.out.println();
//		for (int i = 0; i <= 10;) {
//			System.out.print(i + " ");
//			i++;
//		}
//		System.out.println();
//		int i = 0;
//		for (; i <= 10;) {
//			System.out.print(i + " ");
//			i++;
//		}

//		System.out.println();
//		int j = 0;
//		for (;;) {
//			if (j <= 10) {
//				System.out.print("DD:" + j + " ");
//				j++;
//			}
//			break;
//		}
	
//		for (int x = 0, z = 10; x < z; x++, z--) {
//			System.out.println("x :" + x + " z: " + z);
//		}
//		
//		String text = "Text for For cycle ...";
//		
//		for (int i = 0; i < text.length(); i++) {
//			System.out.print(text.charAt(i) + ", ");
//		}
//		
		int[][] numbersArray = {{1,2,3,4,5},{1,2,3,4,5}};
		for (int v = 0; v < numbersArray.length;v++) {
			for (int c = 0; c < numbersArray[v].length;c++){
				System.out.print(numbersArray[v][c] + " ");
			}
			System.out.println();
		}
	}


	}



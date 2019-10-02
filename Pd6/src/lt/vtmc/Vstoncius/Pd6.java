/**
 * 
 */
package lt.vtmc.Vstoncius;

/**
 * @author vilius
 *
 */
public class Pd6 {
	static String name = "Bendras";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		defineByte();
		defineInt();
		defineShort();
		defineFloat();
		defineDouble();
		defineChar();
		defineBoolean();
		defineLong();
		localCommon();
		orderOfAction();
		mixedTypes();

	}

	private static void mixedTypes() {
		int integer = 5;
		byte bytee = 2;
		System.out.println("Sudedame int su byte (auto convesion): " + (integer + bytee));

	}

	private static void orderOfAction() {
		int intOne = 1;
		int intTwo = 2;
		int intThree = 3;
		boolean bolOne = true;
		boolean bolTwo = false;

		System.out
				.println("Veiksmu tvarka aritmetikoje: " + (intOne + intTwo * intThree - (intOne / intTwo + intThree)));
		System.out.println("Veiksmu tvarka su loginiais argumentais: " + ((bolOne | bolTwo) & (bolTwo && bolOne)));
	}

	private static void localCommon() {
		System.out.println("Bendra reiksme: " + name);
		String name = "Private";
		System.out.println("Vietine reiksme: " + name);

	}

	public static void defineLong() {
		long longSampleValue = 1234567890123456L;
		long longSampleValue2 = 9876544321L;
		System.out.println("Sample long: " + longSampleValue);
		System.out.println("Sudetis long: " + (longSampleValue + longSampleValue2));

	}

	public static void defineBoolean() {
		boolean bolSampleValue = true;
		boolean bolSampleValue2 = false;
		System.out.println("Boolean sample: " + bolSampleValue);
		System.out.println("Boolean test: " + (bolSampleValue & bolSampleValue2));
	}

	public static void defineChar() {
		char charSampleValue = 'a';
		char charSampleValue2 = 'A';
		System.out.println("Char sample: " + charSampleValue);
		System.out.println("Char addition: " + (char) (charSampleValue + charSampleValue2));

	}

	public static void defineDouble() {
		double doubleSampleValue = 1234567;
		double doubleSampleValue2 = 7890987.2;
		System.out.println("Double sample: " + doubleSampleValue);
		System.out.println("Double sample addition: " + (doubleSampleValue + doubleSampleValue2));

	}

	public static void defineFloat() {
		float floatSampleValue = 123.456f;
		float floatSampleValue2 = 41.231f;
		System.out.println("Smaple float: " + floatSampleValue);
		System.out.println("Sample addition float: " + (floatSampleValue + floatSampleValue2));

	}

	public static void defineShort() {
		short shortSampleValue = 100;
		short shortSampleValue2 = 12;
		System.out.println("Sample short value: " + shortSampleValue);
		System.out.println("Sample short addition: " + (shortSampleValue + shortSampleValue2));

	}

	public static void defineInt() {
		int intSampleValue = 12345;
		int intSampleValue2 = 54321;
		System.out.println("Samlple int value: " + intSampleValue);
		System.out.println("Sample int addition: " + (intSampleValue + intSampleValue2));

	}

	public static void defineByte() {
		byte byteSampleValue = 123;
		byte byteSampleValue2 = 20;
		System.out.println("Sample byte value: " + (byte) byteSampleValue);
		System.out.println("Sample byte addition (with overload): " + (byte) (byteSampleValue + byteSampleValue2));

	}

}

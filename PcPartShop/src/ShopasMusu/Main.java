package ShopasMusu;

public class Main {

	public static void main(String[] args) {
//Shop: Computer device parts, make computer or sell by parts
//Client: who can order device parts or whole computer with various configurations
//Order: price, vat, part list
//		
//		
//		
//		
//		
//		
//		
//		
	Client dave = new Client("Dave");
	dave.buildPc();
	System.out.println();
	dave.pickParts();
	}

}

package ShopasMusu;

public class Motherboard extends PcPart implements PcBuilder, PickableParts {

	public Motherboard(String category, int id) {
		super(category, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		double price = 100;
		return price;
	}

	@Override
	public void buildPC() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Motherboard " + getCategory() + " which costs " + generateFullPrice() + "$(including VAT)";
	}

	@Override
	public double generateFullPrice() {
		double fullPrice = this.getPrice() * getVAT();
		return fullPrice;
	}

}

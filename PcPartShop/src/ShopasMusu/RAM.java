package ShopasMusu;

public class RAM extends PcPart implements PcBuilder, PickableParts {

	public RAM(String category, int id) {
		super(category, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		double price = 60;
		return price;
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "RAM " + getCategory() + " which costs " + generateFullPrice() + "$(including VAT)";
	}

	@Override
	public void buildPC() {
		// TODO Auto-generated method stub

	}

	@Override
	public double generateFullPrice() {
		double fullPrice = this.getPrice() * getVAT();
		return fullPrice;
	}

}

package ShopasMusu;

public abstract class PcPart implements PickableParts, PcBuilder{

	private String category;
	private int id;
	private final double VAT = 1.21;

	public PcPart(String category, int id) {
		this.category = category;
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public int getId() {
		return id;
	}

	public double getVAT() {
		return VAT;
	}
	

}

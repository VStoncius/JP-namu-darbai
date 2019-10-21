package lt.vtmc.Delivery;

public abstract class ElectronicDevice implements Deliverable{
	private String name;
	private int amount;
	private double cost;
	
	public ElectronicDevice(String name, int id, double cost) {
		super();
		this.name = name;
		this.amount = id;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public double getCost() {
		return cost;
	}
	
	
}

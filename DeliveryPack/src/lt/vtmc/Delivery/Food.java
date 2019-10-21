package lt.vtmc.Delivery;

public abstract class Food implements Deliverable{
	private String name;
	private int amount;
	private double cost;
	
	public Food(String name, int amount, double cost) {
		super();
		this.name = name;
		this.amount = amount;
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

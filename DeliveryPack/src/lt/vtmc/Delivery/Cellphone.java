package lt.vtmc.Delivery;

public class Cellphone extends ElectronicDevice implements Orderable{

	public Cellphone(String name, int id, double cost) {
		super(name, id, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFullPrice() {
		double fullPrice = this.getAmount()*this.getCost() + this.getDeliveryCost();
		return fullPrice;
	}

	@Override
	public double getDeliveryCost() {
		double delCost;
		if (this.getAmount() < 3) {
			delCost = 5;
		}
		else {
			delCost = 0;
		}
		return delCost;
	}

}

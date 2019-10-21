package lt.vtmc.Delivery;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public double getHungry(String name, int amount, double cost) {
		Deliverable pizza = new Pizza(name, amount, cost);
		double price = pizza.getFullPrice();
		return price;
		
	}
	
	public double wantNewPhone(String name, int amount, double cost) {
		Deliverable pizza = new Pizza(name, amount, cost);
		double price = pizza.getFullPrice();
		return price;
	}
}

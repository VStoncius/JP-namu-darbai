package ShopasMusu;

import java.util.Scanner;

public class Client {
	private String name;
	private static int[] cart = new int [0];

	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	static int[] getCart() {
		return cart;
	}


	public double buildPc() {
		PcBuilder disk = new HDD("Samsung", 123);
		PcBuilder cpu = new CPU("Intel", 213);
		PcBuilder ram = new RAM("Corsair", 312);
		PcBuilder moth = new Motherboard("Gigabyte", 421);
		double fullPrice = (disk.generateFullPrice() + cpu.generateFullPrice() + ram.generateFullPrice()
				+ moth.generateFullPrice()) * 1.1;
		System.out.println(disk.toString());
		System.out.println(cpu.toString());
		System.out.println(ram.toString());
		System.out.println(moth.toString());
		System.out.println("Total price: " + fullPrice + "$ (includes assembly and maintenance costs)");
		return fullPrice;
	}

	double fullCart = 0;

	Scanner input = new Scanner(System.in);

	public void pickParts() {
		System.out.println("Please choose a part to buy:");
		System.out.println("1. HDD");
		System.out.println("2. CPU");
		System.out.println("3. RAM");
		System.out.println("4. Motherboard");
		int number = input.nextInt();
		if (number == 1) {
			PickableParts disk = new HDD("Samsung", 123);
			fullCart = fullCart + disk.generateFullPrice();
//			cart[cart.length] = disk.getId();
			repeat();
			
		} else if (number == 2) {
			PickableParts cpu = new CPU("Intel", 213);
			fullCart = fullCart + cpu.generateFullPrice();
//			int []tmp = new int [cart.length];
//			tmp[cart.length]= cpu.getId();
//			cart = tmp;
			repeat();
		} else if (number == 3) {
			PickableParts ram = new RAM("Corsair", 312);
			fullCart = fullCart + ram.generateFullPrice();
//			cart[cart.length] = ram.getId();
			repeat();
		}
		else if (number == 4) {
			PcBuilder moth = new Motherboard("Gigabyte", 421);
			fullCart = fullCart + moth.generateFullPrice();
//			cart[cart.length] = moth.getId();
			repeat();
		}
		else {
			pickParts();
		}
	}
	
		private void repeat() {
			String selection = input.nextLine();
			System.out.println("Would you like to buy another part? (Y/N)");
			
			selection.toLowerCase();
			if (selection.equals("y")) {
				pickParts();
			}
			else if (selection.equals("n")) {
				System.out.println("Total price for your cart is: " + fullCart + "$ (including VAT)");
			}
			else if (selection != "y" & selection != "n"){
				repeat();
			}
		}
	}



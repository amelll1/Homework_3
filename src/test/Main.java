package test;

import test.MediaProduct.Genre;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test");
		StockManagerSingleton joe = new StockManagerSingleton("files/inventory.csv");
		joe.intializeStock();
		MediaProduct heat = new MediaProduct("Rainbow Goblins",24.99,1981,Genre.ELECTRONIC);
		joe.addItem(heat);
		System.out.println(heat.toString());
		joe.updateItemPrice(heat, 5);
		System.out.println(heat.toString());
	}

}

package test;

import test.MediaProduct.Genre;
import java.util.*;

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
		joe.saveStock();
		System.out.println("removed: " + heat.toString());
		ArrayList<MediaProduct> media = new ArrayList<MediaProduct>();
		media = joe.getMediaProductBelowPrice(20);
		System.out.println(media);
		joe.printListOfMediaProduct(media);
		ArrayList<VinylRecordProduct> vinyl = new ArrayList<VinylRecordProduct>();
		vinyl = joe.getVinylRecordList(media);
		System.out.println(vinyl);
		ArrayList<CDRecordProduct> CD = new ArrayList<CDRecordProduct>();
		CD = joe.getCDRecordsList(media);
		System.out.println(CD);
		ArrayList<TapeRecordProduct> tape = new ArrayList<TapeRecordProduct>();
		tape = joe.getTapeRecordList(media);
		System.out.println(tape);
	}

}

package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.MediaProduct.Genre;

public class StockManagerSingleton {
	List<MediaProduct> mediaproducts = new ArrayList<MediaProduct>();
	private String inventoryFilePath;
	public StockManagerSingleton(String filePath) {
		inventoryFilePath = filePath;
	}
	public boolean intializeStock() {
		FileInputStream stockManagerData;
		try {
			stockManagerData = new FileInputStream(inventoryFilePath);
			Scanner sc = new Scanner(stockManagerData);
			sc.nextLine();
			while (sc.hasNext()) {
				String csvLine = sc.nextLine();
				String[] arrData = csvLine.split(",");
//				for (String a : arrData) {
//					System.out.println(" - "+ a);
//				}
//				System.out.println("SPACE");
				String type = arrData[0];
				String name = arrData[1];
				double price = Double.valueOf(arrData[2]);
				int year = Integer.valueOf(arrData[3]);
				Genre genre = Genre.valueOf(arrData[4]);
				if (type.equals("Vinyl")) {
					VinylRecordProduct typeMedia = new VinylRecordProduct(name,price,year,genre);
					mediaproducts.add(typeMedia);
				} else if (type.equals("CD")) {
					CDRecordProduct typeMedia = new CDRecordProduct(name,price,year,genre);
					mediaproducts.add(typeMedia);
				} else if (type.equals("Tape")) {
					TapeRecordProduct typeMedia = new TapeRecordProduct(name,price,year,genre);
					mediaproducts.add(typeMedia);
				} else {
					MediaProduct media = new MediaProduct(name,price,year,genre);
					mediaproducts.add(media);
				}
			}
			stockManagerData.close();
			sc.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateItemPrice(MediaProduct product, double newPrice) {
		product.setPrice(newPrice);
		if (product.getPrice() == newPrice) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addItem(MediaProduct product) {
		mediaproducts.add(product);
		if (mediaproducts.contains(product)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean removeItem(MediaProduct product) {
		if(MediaProduct.contains(product)) {
			MediaProduct.remove(product);
			return true;
		}
		return false;
	}
	public boolean saveStock() {
		return true;
	}
//	public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice){
//		
//	}
	public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
		
	}
//	public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList){
//		
//	}
//	public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList){
//	
//}
//	public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList){
//	
//}
}

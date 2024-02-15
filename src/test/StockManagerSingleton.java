package test;

import java.util.ArrayList;

public class StockManagerSingleton {
	public StockManagerSingleton(String inventoryFilePath) {
	}
	public boolean intializeStock() {
		return true;
	}
	public boolean updateItemPrice(MediaProduct product, double newPrice) {
		return true;
	}
	public boolean addItem(MediaProduct product) {
		return true;
	}
	public boolean removeItem(MediaProduct product) {
		return true;
	}
	public boolean saveStock() {
		return true;
	}
//	public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice){
//		
//	}
	public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
		
	}
//	public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList(){
//		
//	}
//	public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList(){
//	
//}
//	public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList(){
//	
//}
}

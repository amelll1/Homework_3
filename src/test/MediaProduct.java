package test;

public class MediaProduct {
    private String title;
    private double price;
    private int year;
    private Genre genre;

    public enum Genre {
        ROCK, POP, JAZZ, CLASSICAL, HIP_HOP, ELECTRONIC, CHILDREN
    }

    public MediaProduct(String title, double price, int year, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    public MediaProduct(MediaProduct otherMediaProduct) {
        this.title = otherMediaProduct.title;
        this.price = otherMediaProduct.price;
        this.year = otherMediaProduct.year;
        this.genre = otherMediaProduct.genre;
    }
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
    public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
    public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}

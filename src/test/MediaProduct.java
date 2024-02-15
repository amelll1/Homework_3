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
}

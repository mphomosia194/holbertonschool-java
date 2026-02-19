package products;

public abstract class Products {

    private String title;
    private int year;
    private String country;
    private double grossPrice;

    public Products(String title, int year, String country, double grossPrice) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice = grossPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public abstract double getNetPrice();
}

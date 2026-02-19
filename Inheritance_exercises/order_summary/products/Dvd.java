package products;

public class Dvd extends Products {

    public Dvd(String title, int year, String country, double grossPrice,
               String director, String genre, int duration) {
        super(title, year, country, grossPrice);
    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() * 1.20;
    }
}

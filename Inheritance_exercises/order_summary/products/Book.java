package products;

public class Book extends Products {

    public Book(String title, int year, String country, double grossPrice,
                int pages, String author, int edition) {
        super(title, year, country, grossPrice);
    }

    @Override
    public double getNetPrice() {
        return getGrossPrice() * 1.15;
    }
}

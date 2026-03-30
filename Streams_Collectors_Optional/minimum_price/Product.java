import java.util.Locale;

public class Product {
    private int code;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(int code, String name, ProductCategory category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(java.util.Locale.FRANCE, "[%d] %s %s $ %.2f", code, name, category, price);
    }
}

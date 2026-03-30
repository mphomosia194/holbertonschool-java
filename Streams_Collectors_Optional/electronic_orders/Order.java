import java.util.List;

public class Order {
    private int code;
    private List<Product> products;
    private Client client;

    public Order(int code, List<Product> products, Client client) {
        this.code = code;
        this.products = products;
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s", code, client.getName());
    }
}

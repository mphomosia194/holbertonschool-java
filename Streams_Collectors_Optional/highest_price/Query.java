import java.util.*;

public class Query {

    public static Product getProductWithHighestPrice(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .findFirst()
                .orElse(null);
    }
}

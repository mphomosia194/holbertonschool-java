import java.util.*;
import java.util.stream.*;

public class Query {

    public static List<Product> getProductsByMinimumPrice(List<Product> products, double minPrice) {
        return products.stream()
                .filter(p -> p.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }
}

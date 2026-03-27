import java.util.*;
import java.util.stream.*;

public class Query {
    public static List<Product> getBooksFromOrder(Order order) {
        return order.getProducts()
                .stream()
                .filter(p -> p.getCategory() == ProductCategory.BOOK)
                .collect(Collectors.toList());
    }
}

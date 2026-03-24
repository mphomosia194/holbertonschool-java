import java.util.*;

public class ProductSearch {
    public static List<Product> filter(List<Product> products, FilterCriteria criteria) {
        List<Product> result = new ArrayList<>();

        for (Product p : products) {
            if (criteria.test(p)) {
                result.add(p);
            }
        }

        return result;
    }
}

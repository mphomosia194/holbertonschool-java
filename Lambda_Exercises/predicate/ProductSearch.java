import java.util.*;
import java.util.function.Predicate;

public class ProductSearch {
    public static List filter(List products, Predicate<Product> predicate) {
        List result = new ArrayList();

        for (Object obj : products) {
            Product p = (Product) obj;
            if (predicate.test(p)) {
                result.add(p);
            }
        }

        return result;
    }
}

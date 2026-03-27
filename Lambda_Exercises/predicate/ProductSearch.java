import java.util.*;
import java.util.function.Predicate;

public class ProductSearch {
public static List<Product> filter(List<Product> products, Predicate<Product> predicate) {
List<Product> result = new ArrayList<>();

for (Product p : products) {
if (predicate.test(p)) {
result.add(p);
}
}

return result;
}
}

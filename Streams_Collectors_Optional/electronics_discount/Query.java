import java.util.*;
import java.util.stream.*;

public class Query {

    public static List<Product> apply15PercentDiscountToElectronics(List<Product> products) {
        return products.stream()
                .map(p -> {
                    if (p.getCategory() == ProductCategory.ELECTRONIC) {
                        p.setPrice(p.getPrice() * 0.85);
                    }
                    return p;
                })
                .collect(Collectors.toList());
    }
}

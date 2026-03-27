import java.util.*;
public class ProductSearch {
public static List filter(List products, FilterCriteria criteria) {
List result = new ArrayList();
for (Object obj : products) {
Product p = (Product) obj;
if(criteria.test(p)) {
result.add(p);
}
}
return result;
}
}

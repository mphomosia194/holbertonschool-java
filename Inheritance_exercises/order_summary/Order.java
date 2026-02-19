import java.util.Locale;
import products.Products;

public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    private double calculateTotalProducts() {
        double total = 0;

        for (ItemOrder item : items) {
            total += item.getQuantity() * item.getProduct().getNetPrice();
        }

        return total;
    }

    public void presentOrderSummary() {

        double totalProducts = calculateTotalProducts();
        double discount = totalProducts * discountPercentage / 100.0;
        double totalOrder = totalProducts - discount;

        System.out.println("------- ORDER SUMMARY -------");

        for (ItemOrder item : items) {

            Products product = item.getProduct();
            String type = product.getClass().getSimpleName();
            double price = product.getNetPrice();
            int quantity = item.getQuantity();
            double totalItem = price * quantity;

            System.out.printf(Locale.GERMANY,
                    "Type: %s Title: %s Price: %.2f Quant: %d Total: %.2f\n",
                    type,
                    product.getTitle(),
                    price,
                    quantity,
                    totalItem);
        }

        System.out.println("----------------------------");

        System.out.printf(Locale.GERMANY, "DISCOUNT: %.2f\n", discount);

        if (discountPercentage != 10) {
            System.out.printf(Locale.GERMANY, "TOTAL PRODUCTS: %.2f\n", totalProducts);
            System.out.println("----------------------------");
            System.out.printf(Locale.GERMANY, "TOTAL ORDER: %.2f\n", totalOrder);
        } else {
            System.out.printf(Locale.GERMANY, "TOTAL ORDER: %.2f\n", totalProducts);
            System.out.println("----------------------------");
            System.out.printf(Locale.GERMANY, "TOTAL PEDIDO: %.2f\n", totalOrder);
        }

        System.out.println("----------------------------");
    }
}

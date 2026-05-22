import java.util.HashSet;

public class Order {

    private HashSet<OrderItem> itemsInBox = new HashSet<>();
    private HashSet<OrderItem> itemsOutOfBox = new HashSet<>();

    public void addItemInBox(OrderItem item) {

        itemsInBox.add(item);
    }

    public void addItemOutOfBox(OrderItem item) {

        itemsOutOfBox.add(item);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("\tOut of the Box:\n");

        for (OrderItem item : itemsOutOfBox) {
            builder.append("\t\t")
                   .append(item)
                   .append("\n");
        }

        builder.append("\tIn the Box:\n");

        for (OrderItem item : itemsInBox) {
            builder.append("\t\t")
                   .append(item)
                   .append("\n");
        }

        return builder.toString();
    }
}

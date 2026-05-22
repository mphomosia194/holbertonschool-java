public class OrderItem {

    private OrderItemType type;
    private String name;

    public OrderItem(OrderItemType type, String name) {

        this.type = type;
        this.name = name;
    }

    public OrderItemType getType() {

        return type;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {

        return "- " + type + " " + name;
    }

    @Override
    public int hashCode() {

        return type.hashCode() + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OrderItem)) {
            return false;
        }

        OrderItem other = (OrderItem) obj;

        return type.equals(other.type)
                && name.equals(other.name);
    }
}

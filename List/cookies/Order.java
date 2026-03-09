import java.util.ArrayList;

public class Order {

    private ArrayList<CookieOrder> cookies;

    public Order() {
        cookies = new ArrayList<CookieOrder>();
    }

    public void addCookieOrder(CookieOrder order) {
        cookies.add(order);
    }

    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : cookies) {
            total += order.getBoxQuantity();
        }
        return total;
    }

    public int removeFlavor(String flavor) {
        int removedBoxes = 0;

        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getFlavor().equals(flavor)) {
                removedBoxes += cookies.get(i).getBoxQuantity();
                cookies.remove(i);
                i--;
            }
        }

        return removedBoxes;
    }
}

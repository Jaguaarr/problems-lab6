import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> inventory = new ArrayList<>();
    private ArrayList<OrderItem> order = new ArrayList<>();

    public void addToInventory(ProductForSale p) {
        inventory.add(p);
    }

    public void addItemToOrder(ProductForSale p, int qty) {
        order.add(new OrderItem(qty, p));
    }

    public void printOrder() {
        for (OrderItem item : order) {
            item.product().printDetails(item.qty());
        }
    }
}

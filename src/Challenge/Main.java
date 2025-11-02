public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        ProductForSale p1 = new ProductA();
        ProductForSale p2 = new ProductB();

        store.addToInventory(p1);
        store.addToInventory(p2);

        store.addItemToOrder(p1, 3);
        store.addItemToOrder(p2, 2);

        store.printOrder();
    }
}

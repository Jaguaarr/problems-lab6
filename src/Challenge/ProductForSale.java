public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty) {
        return price * qty;
    }

    public void printDetails(int qty) {
        System.out.printf("%d x %s = %.2f dh\n", qty, type, getSalesPrice(qty));
    }

    public abstract void showDetails();
}

public class ProductB extends ProductForSale {
    public ProductB() {
        super("Product B", 80.0, "This is product B");
    }

    @Override
    public void showDetails() {
        System.out.println("Details of Product B: " + description);
    }
}

public class ProductA extends ProductForSale {
    public ProductA() {
        super("Product A", 50.0, "This is product A");
    }

    @Override
    public void showDetails() {
        System.out.println("Details of Product A: " + description);
    }
}



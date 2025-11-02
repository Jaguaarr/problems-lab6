package problem2;
import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer customer){
        for (Customer c : customers) {
            if (c.getName().equals(customer.getName())) {
                System.out.println(c.getName() + " already exists");
                return false;
            }

        }
        customers.add(customer);
        return true;

    }

    public void removeCustomer(Customer customer){
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customer.getName())) {
                customers.remove(i);
            }
        }
    }
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void addTransaction(Customer customer, double amount){
        for  (Customer c : customers) {
            if (c.getName().equals(customer.getName())) {
                c.addTransaction(amount);
            }
        }
    }
    public void print(Customer customer){
        System.out.print(customer.getName());
        System.out.print("| Transactions: {");
        for (double amount : customer.getTransactions()) {
            System.out.print(amount +", ");
        }
        System.out.println("}");

    }
}

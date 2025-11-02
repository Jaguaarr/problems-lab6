package problem2;

public class Main {
    public static void main(String[] arg){
        Customer customer1 =  new Customer("Haytam");
        Customer customer2 =  new Customer("Ilyass");
        Customer customer3 =  new Customer("Ayoub");

        Bank bank = new Bank("BMCE");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        bank.addTransaction(customer1, -900);
        bank.addTransaction(customer1, 100);
        bank.addTransaction(customer1, 300);

        bank.addTransaction(customer2, -200);
        bank.addTransaction(customer2, 400);


        bank.addTransaction(customer3, -300);

        for (Customer customer : bank.getCustomers()) {
            bank.print(customer);
        }
    }
}

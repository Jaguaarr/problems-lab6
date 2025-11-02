package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList<Double> transactions;
    public Customer(String name){
        this.name = name;
        this.balance = 0;
        transactions = new ArrayList<>();

    }
    public void addTransaction (double amount){
        if (amount < balance){
            transactions.add(amount);
            this.balance -= amount;
        }
        else{
            System.out.println("Transaction overflow");
            System.out.println("amount: " + amount + " balance: " + balance);
        }


    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}

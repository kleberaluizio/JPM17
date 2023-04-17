package lpa.dev;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer (String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000);
        System.out.println(bob);
    }
}

class BankType {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public BankType(String name) {
        this.name = name;
    }
    private Customer getCustomer (String customerName){
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found!", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: "+ customer);
        }
    }
}

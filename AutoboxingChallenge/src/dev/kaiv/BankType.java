package dev.kaiv;

import java.util.ArrayList;

public class BankType {
    private String name;
    private ArrayList<Customer> customersArray;

    public BankType(String name){
        this.name = name;
        this.customersArray = new ArrayList<>();
    }
    public void addCustomer(String customerName){

        Customer newCustomer = new Customer(customerName);

            for (int i = 0; i < customersArray.size(); i++) {
                if (newCustomer.getName().equalsIgnoreCase(customersArray.get(i).getName()) || newCustomer==customersArray.get(i)) {
                    continue;
                }
                customersArray.add(newCustomer);
            }
        if (customersArray.isEmpty()){
            customersArray.add(newCustomer);
        }
    }
    public void addCustomer(String customerName, boolean flag){

        Customer newCustomer = new Customer(customerName);

        customersArray.add(newCustomer);
    }
    public void addTransaction(double value, String customerName) {

        boolean flag = false;
        int lastIndex =  customersArray.size() -1;
        for (int i = 0; i < customersArray.size(); i++) {
            if (customerName.equalsIgnoreCase(customersArray.get(i).getName()) ) {
                customersArray.get(i).setTransactions(value);
                flag = true;
                return;
            }
        }
        if (!flag) {
            addCustomer(customerName, flag);
            addTransaction(value, customerName);
        }

    }
    public ArrayList<Customer> getCustomers(){
        return customersArray;
    }

    private Customer getCustomer (String customerName){
        for (var customer : customersArray){
            if (customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found! \n", customerName);

        return null;
    }
    public void printStatement(String customerName){
        Customer customerO= new Customer(customerName);

        for (var customer : customersArray){
            if (customer.getName().equalsIgnoreCase(customerName)){
                customerO = customer;
            }
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: "+ customerO.getName());
        System.out.println("Transactions: ");
        for (int i = 0; i< customerO.getTransactions().size();i++){
            double d = customerO.getTransactions().get(i);
            System.out.printf("$%10.2f (%s)%n", d, d<0? "debit" : "credit");
        }

    }
}



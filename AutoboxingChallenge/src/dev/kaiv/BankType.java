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
}



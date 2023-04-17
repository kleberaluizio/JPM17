package dev.kaiv;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public String getName(){
        return name;
    }


    public void  setTransactions(Double value){
        transactions.add(value);
        System.out.println(getName() + "'s transaction amounts = " + value);

    }
}

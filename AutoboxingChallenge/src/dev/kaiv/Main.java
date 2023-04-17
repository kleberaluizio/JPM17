package dev.kaiv;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        BankType santander = new BankType("Santander");
        santander.addCustomer("Kleber");
        santander.addCustomer("Nari");

        santander.addTransaction(350, "Kleber");
        santander.addTransaction(-50, "Kleber");
        santander.addTransaction(50, "Nari");
        santander.addTransaction(20, "Nedir");


        for (Customer customer : santander.getCustomers()){
            System.out.println(customer);
        }






    }
}

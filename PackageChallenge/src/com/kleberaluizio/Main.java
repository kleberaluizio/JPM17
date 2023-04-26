package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n"+"-".repeat(30));

        for (int i =0 ; i <= 10; i++){
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println("\n"+"-".repeat(30));

        for (int i =0 ; i <= 10; i++){
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println("\n"+"-".repeat(30));

        for (int i =0 ; i <= 10; i++){
            System.out.print(Series.fibonacci(i) + " ");
        }
        System.out.println("\n"+"-".repeat(30));

    }
}

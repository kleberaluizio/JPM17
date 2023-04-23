package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        System.out.println("-".repeat(30));

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        System.out.println("-".repeat(30));

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}

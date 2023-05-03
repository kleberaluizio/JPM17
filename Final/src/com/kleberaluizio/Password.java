package com.kleberaluizio;

public class Password {
    private static final int key = 78576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password^key;
    }

    public void storePassword(){
        System.out.println("Saving password as "+ this.encryptedPassword);
    }

    public boolean letMeIn(int passoword){
        if (encryptDecrypt(passoword) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}

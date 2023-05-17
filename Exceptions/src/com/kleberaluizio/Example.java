package com.kleberaluizio;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e ){
            System.out.println(e.toString());
            System.out.println("unable to perform division, autopilot shutting down!");
        }

    }
    private static int divide(){
       int x,y;
//       try {
           x = getInt();
           y = getInt();
           System.out.println("x is "+x +", y is "+y);
           return x / y;
//       }catch (NoSuchElementException  e){
//           throw new NoSuchElementException("no suitable input");
//       } catch (ArithmeticException e) {
//           throw new ArithmeticException("attempt to divide by zero!");
//       }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a integer number: ");
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                // go around again. Read past the end of line in the input first.
                s.nextLine();
                System.out.print("Please enter a integer number using only the digits 0 to 9: ");
            }
        }
//        try {
//            return s.nextInt();
//        } catch (ArithmeticException ae){
//            System.out.println("You must not enter Zero!!!");
//            System.exit(1);
//            return 1;
//        } catch (InputMismatchException ime){
//            System.out.println("You must enter a INTEGER NUMBER!!!");
//            System.exit(1);
//            return 1;
//        }
    }
}

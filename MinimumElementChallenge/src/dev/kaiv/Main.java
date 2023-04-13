package dev.kaiv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("Array = " + Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum value found = "+ returnedMin);
    }
    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i< splits.length; i++){
            try {
                values[i] = Integer.parseInt(splits[i].trim());
            } catch (NumberFormatException badUserData){
                System.out.print("ERROR! Please, ");
                readIntegers();
            }
        }

        return values;
    }

    public static int findMin(int[] values) {

        int min = values[0]; // or min = Integer.MAX_VALUE;

        for (int value : values) {
            if (min > value){
                min = value;
            }
        }
        return min;
    }
}

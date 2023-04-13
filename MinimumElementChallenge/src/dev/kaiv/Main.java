package dev.kaiv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("Array = " + Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum value found = "+ returnedMin);
        System.out.println("-".repeat(20));

        //reverse(returnedArray);
        //System.out.println("Final = " + Arrays.toString(returnedArray));

        int [] reversedCopy = reversedCopy(returnedArray);
        System.out.println("reverseCopy = " + Arrays.toString(reversedCopy));

        int [] reversedOrder = Arrays.copyOf(returnedArray, returnedArray.length);
        Arrays.sort(Comparator.reverseOrder(reversedOrder));
        System.out.println("reverseOrder = " + Arrays.toString(reversedCopy));


    }
    public static void reverse(int[] array){

        int lastIndex = (array.length - 1);
        int halfLength = array.length/2;


        for (int i = 0; i < halfLength ;i++) {
            int temp = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
    public static int[] reversedCopy(int[] array){
        int[] reversedCopy = Arrays.copyOf(array,array.length);
        int lastIndex = (array.length - 1);
        int halfLength = array.length/2;

        for (int i = 0; i < halfLength ;i++) {
            reversedCopy[i] = array[lastIndex - i];
            reversedCopy[lastIndex - i] = array[i];
            System.out.println(Arrays.toString(reversedCopy));
        }
        return reversedCopy;
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

package dev.kaiv;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        int[] s1 = getRandomArray(5);
        System.out.println(Arrays.toString(s1));
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1));

        int[] s2 = sortArrayInDescendingOrder(s1);
        System.out.println(Arrays.toString(s2));




    }
    public static int[] sortArrayInDescendingOrder(int[] arr){

        int[] array = new int[arr.length];

        for (int i = 0; i < array.length; i++){
            array[i] = arr[((array.length - 1) - i)];
        }
        return array;
    }

    public static int[] getRandomArray(int length){
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++){
            array[i] = random.nextInt(1000);
        }
        return array;
    }

}

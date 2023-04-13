package dev.kaiv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.lenght = " + array2.length);

        for (int[] array : array2){
            System.out.println(Arrays.toString(array));
        }

        for (int i =0; i < array2.length ; i++){
            var innerArray = array2[i];

            for (int j =0; j < innerArray.length; j++){
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10)+(j+1);
            }
//          System.out.println();
        }

//        for (var outer : array2){
//            for(var element :outer){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2));
    }
}

package dev.kaiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args){

        Integer boxeInt = Integer.valueOf(15);           // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15);   // deprecated since JDK 19
        int unboxedInt = boxeInt.intValue();                // unnecessary Manually unboxing
        int unboxed = boxeInt; // Automatic unboxing

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed =getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray.getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var outList = List.of(1,2,3,5);
        System.out.println(outList);

    }
    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs){
            aList.add(i);
        }
        return aList;
    }
    private static int returnAnInt(Integer i){
        return i;
    }
    private static Integer returnAnInteger(int i){
        return i;
    }

    public static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }
    public static double getLiteralDoublePrimitive() {

        return 100.00;
    }
}

package dev.kaiv;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayofTheWeek weekDay = DayofTheWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekDay.name(), weekDay.ordinal());


        for (int i= 0; i < 10 ;i++) {
            weekDay = getRandomDay();

            switchDayOfWeek(weekDay);

//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayofTheWeek.FRI){
//                System.out.println("Found a Friday!!!");
//            }
        }

        for (Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }



    }
    public static void switchDayOfWeek(DayofTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " +
                    weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " +
                    weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        };
    }
    public static DayofTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayofTheWeek.values();

        return allDays[randomInteger];

    }
}

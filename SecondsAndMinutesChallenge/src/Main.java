public class Main {
    public static void main(String[] args) {
        System.out.println(3945%60);
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-17));
        System.out.println(getDurationString(-1,10));
        System.out.println(getDurationString(40,90));
        System.out.println(getDurationString(90, 32));


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds ("+seconds+ ")! The seconds parameter should be a positive value.";

        }else if (seconds > 59){

            return getDurationString((seconds / 60),seconds % 60);

        }else{
            return getDurationString(0,seconds);
        }


    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes("+ minutes + ")! The minutes parameter should be a positive value";

        } else if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds("+ seconds + ")! The seconds parameter should a positive value less than 60";

        }else{
            int hours = minutes / 60;
            int min = minutes % 60;

            return hours + "h " + min + "min " + seconds + "s";
        }
    }
}

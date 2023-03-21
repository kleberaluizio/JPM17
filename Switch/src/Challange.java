public class Challange {

    public static void main(String[] args) {
        String month = "October";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month){
        switch (month){
            case "January": case "February": case "April": case "March":
                return "2nd";
            case "May": case "June": case "July": case "August":
                return "1st";
            case "September": case "October": case "November": case "Dezember":
                return "3rd";
        }
        return "Bad";

    }
}

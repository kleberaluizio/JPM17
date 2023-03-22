public class EnhancedSwitch {
    public static void main(String[] args) {
    int value = 5;

        switch (value) { // Can be used since JDK 9
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4, 5, 6 -> {
                System.out.println("Value was 4, 5, or 6");
                System.out.println("Actually, the value was " + value);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, 5 or 6");
        }

        String month = "Not a month";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

    }

    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "April", "March" -> "2nd";
            case "May", "June", "July", "August" -> "1st";
            case "September", "October", "November", "Dezember" -> "3rd";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }

        };

    }
}

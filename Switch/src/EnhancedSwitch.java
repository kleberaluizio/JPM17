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
    }
}

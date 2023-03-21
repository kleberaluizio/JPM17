public class Main {
    public static void main(String[] args) {
        int value = 4;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        switch (value) {
            case 1: // Code for value == 1
                System.out.println("Value was 1");
                break;
            case 2: // Code for value == 2
                System.out.println("Value was 2");
                break;
            case 3: // Code for value == 3
                System.out.println("Value was 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Value was " + value);
                break;
            default: // Code for value not in the cases
                System.out.println("Value was not 1, 2, 3, 4, 5 or 6");
                break;

        }
    }
}

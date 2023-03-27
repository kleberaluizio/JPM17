import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double maxNumber=0;
        double minNumber=0;
        int loopCount = 0;
        do{
            System.out.println("Enter a number, or any character to exit: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());

                    maxNumber = (number > maxNumber || loopCount == 0) ? number : maxNumber;
                    minNumber = (number < minNumber || loopCount == 0) ? number : minNumber;

                loopCount ++;
            } catch (NumberFormatException badUserData){
                break;
            }

        }while (true);

        if (loopCount > 0) {
            System.out.println("Max = " + maxNumber + " Min = " + minNumber);
        } else {
            System.out.println("No valid data entered!");
        }

    }
}

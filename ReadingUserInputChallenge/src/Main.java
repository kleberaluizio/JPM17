import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        while (count <= 5) {
            System.out.println("Enter number #" + count + ":");
            try {
                double userValueInput = Double.parseDouble(scanner.nextLine());
                sum = sum + userValueInput;
                count++;

            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number!");
            }
        }

        System.out.println("The sum of those five numbers is = " + sum);
    }
}

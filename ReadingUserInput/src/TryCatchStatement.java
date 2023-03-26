import java.util.Scanner;

public class TryCatchStatement {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi "+ name + ", nice to meet you!");

        String dateOfBirth = System.console().readLine("What year were your born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi "+ name + ", nice to meet you!");

        System.out.println("What year were your born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        if (age < 0 || age > 114){
            return "Date of birth given (" + dateOfBirth + ") is not possible to be solved";
        }
        return "So you are " + age + " years old";
    }
}

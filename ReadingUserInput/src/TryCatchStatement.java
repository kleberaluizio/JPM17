import java.util.Scanner;

public class TryCatchStatement {
    public static void main(String[] args) {
        int currentYear = 2023;
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
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            String dateOfBirth = scanner.nextLine();
            age = checkData(currentYear, dateOfBirth);
            validDOB = age < 0 ? false : true;

        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData (int currentYear, String dateOfBirth){
        try {
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)){
                System.out.println("Error! year not valid!");
                return -1;
            }

            return  (currentYear -  dob);

        }catch (NumberFormatException beadUserData){
            System.out.println("Characters not allowed! Try again!");
            return -1;
        }

    }
}

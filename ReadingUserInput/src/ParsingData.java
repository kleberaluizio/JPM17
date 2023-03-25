public class ParsingData {
    public static void main(String[] args) {
        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi "+ name + ", nice to meet you!");

        String dateOfBirth = System.console().readLine("What year were your born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){

        return "";
    }
}

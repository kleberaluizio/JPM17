import java.util.Scanner;

public class NextMain extends Main{
    public static void main(String[] args) {

        while (true){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter G for Gas Powered Car, E for electric car and H for Hybrid car or Q to quit adding cars: ");
            String type = s.nextLine();
            if ("Qq".contains(type)) break;

            System.out.print("Enter a car description: ");
            String description = s.nextLine();

            Car car = Car.getCar(type, description);
            runRace(car);

        }
    }
}

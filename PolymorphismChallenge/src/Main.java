public class Main {
    public static void main (String[] args){

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("-".repeat(15));

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runRace(ferrari);

     /*   GasPoweredCar gasCar = new GasPoweredCar("Dogde Dart",12,8);
        gasCar.startEngine();
        gasCar.drive();
        System.out.println("-".repeat(15));

        ElectricCar electricCar = new ElectricCar("Tesla SUV",200,10);
        electricCar.startEngine();
        electricCar.drive();
        System.out.println("-".repeat(15));*/
    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();
    }
}

public class Main {
    public static void main (String[] args){

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("-".repeat(45));

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runRace(ferrari);
        System.out.println("-".repeat(45));

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);
        System.out.println("-".repeat(45));

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",16,8,8);
        runRace(ferrariHybrid);
        System.out.println("-".repeat(45));
        System.out.println("-".repeat(45));


    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();
    }
}

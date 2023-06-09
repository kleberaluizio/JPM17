public class Car {

    private String description;

    public Car (String description){
        this.description = description;
    }


    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }         // It will be called only by the drive method

    public void drive(){
        System.out.println("Car -> driving, type is "+getClass().getSimpleName());
        runEngine();
    }

    //Factory Method
    public static Car getCar(String type, String description){
        return switch(type.toUpperCase().charAt(0)){

            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);

        };
    }
}

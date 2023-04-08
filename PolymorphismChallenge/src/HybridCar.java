public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    private boolean isRunningInGas;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders, boolean isRunningInGas) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.isRunningInGas = isRunningInGas;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        String message = (isRunningInGas)?"Burning gas!":"Using electricity!";
        System.out.println(message);
    }

    @Override
    public void drive() {
        super.drive();
        String message = (isRunningInGas)?"Driving and making loud noise!":"Driving and making no noise at all!";
        System.out.println(message);
    }

}

public class Car {

    private String description;

    public Car (String description){
        this.description = description;
    }

    public void startEngine(){}
    public void drive(){}
    protected void runEngine(){}         // It will be called only by the drive method

    //  public static void getCar(){}

}
